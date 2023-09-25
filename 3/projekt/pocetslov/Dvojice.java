package pocetslov;

public class Dvojice {
	private int počet;	// Počet výskytů
	private String slovo; // Řetězec (slovo)
	public void dalšíVýskyt() { počet++;} // Zvětši počet výskytů
	public Dvojice(String s) {
		počet = 1;
		slovo = s;
	}
	
	@Override
	public boolean equals(Object obj){
	return slovo.equals(((Dvojice)obj).slovo);
	}
	
	public String toString(){
		return slovo + "(" + počet + ")";
	}
	
}

