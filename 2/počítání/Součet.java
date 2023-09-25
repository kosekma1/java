package počítání;

public class Součet {
	
	public static void main(String... arg) {
		int sčítanec1 = 12, sčítanec2 = 25;
		var výsledek = sčítanec1 + sčítanec2;
		System.out.println("Součet čísel " + sčítanec1 + " + " + sčítanec2 + " je " + výsledek);
		System.out.printf("Součet čísel %d + %d je %d", sčítanec1, sčítanec2, výsledek);
	}
}