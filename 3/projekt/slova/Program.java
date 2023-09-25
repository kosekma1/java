package slova;

import java.io.UnsupportedEncodingException;

public class Program {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		Analyzátor analyzátor;
		if(args.length  == 1){
			analyzátor = new Analyzátor(args[0]);
		} else {
			analyzátor = new Analyzátor(); // vytvoř instanci analyzátoru
		}
		
		analyzátor.běh(); // spusť běh programu
	}

}

class Analyzátor { // Ve zdrojovém souboru java může mít pouze jedna třída specifikátor public
	
	private static String oddělovače = ".,;!? ";
	private java.util.ArrayList<String> slovník = new java.util.ArrayList<String>();
	private String kódování = "Cp852";
	
	public Analyzátor(String kódováStránka){
		kódování = kódováStránka; // neřešíme chybně předané hodnoty
	}
	
	public Analyzátor(){
	}
	
	void běh() throws UnsupportedEncodingException {		
		java.util.Scanner vstup = new java.util.Scanner(System.in, kódování);
		java.io.OutputStreamWriter osw = new java.io.OutputStreamWriter(System.out, kódování);
		java.io.PrintWriter výstup = new java.io.PrintWriter(osw);
		while(vstup.hasNextLine()){ // Čti vstup
			String řádka = vstup.nextLine();
			řádka = řádka.trim(); // odstraň okrajové mezery
			analyzujAUložVýsledky(řádka);
		}
		výstup.println(slovník); // Vypiš výsledky
		výstup.close();
	}		
	
	void analyzujAUložVýsledky(String řádka){
		if(řádka.equals("")) return;
		int index = 0; // Index znaku v řádce
		StringBuffer slovo = null; // Sem uložíme získané slovo
		index = přeskočOddělovače(řádka, index); // najdi začátek dalšího slova					
		
		while(index>=0){ // (-1 == konec řádky) // dokud nejsme na konci řádky
			slovo = new StringBuffer("");
			// Přenes následující slovo do instance "slovo"					
			while(index<řádka.length() && (oddělovače.indexOf(řádka.charAt(index)) == -1)){
				slovo.append(řádka.charAt(index++));
			}
			
			// Ulož slovo do kontejneru
			String s = new String(slovo);
			if(slovník.indexOf(s) == -1) { slovník.add(s); }
			
			index = přeskočOddělovače(řádka, index);
		}
	}
	
	/**
	* Tato metodat přeskočí oddělovače v analyzovaném textu.
	* @param řádka	analyzovaná řádka
	* @param od 	index, od kterého se má začít	
	* @return 		index, kde začíná násleující slovo, nebo -1, jsme-li na konci řádky
	*/
	private int přeskočOddělovače(String řádka, int od){
		if(od >= řádka.length()) {
			return -1;
		}		
		while(oddělovače.indexOf(řádka.charAt(od)) >=0){
			if(++od == řádka.length()) return -1;								
			
		}

		return od;
	}
		
}