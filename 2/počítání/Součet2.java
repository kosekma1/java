package počítání;

public class Součet2 {
	
	public static void main(String... arg) {
		
		java.util.Scanner vstup = new java.util.Scanner(System.in);
		int sčítanec1, sčítanec2;
		
		System.out.println("Zadej první číslo: ");
		sčítanec1 = vstup.nextInt();
		System.out.println("Zadej druhé číslo: ");
		sčítanec2 = vstup.nextInt();		
		System.out.println("Součet čísel " + sčítanec1 + " + " + sčítanec2 + " je " + (sčítanec1+sčítanec2));
		System.out.printf("Součet čísel %d + %d je %d", sčítanec1, sčítanec2, (sčítanec1+sčítanec2));
	}
}