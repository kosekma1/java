package počítání;

public class Faktoriál {

	static final int HORNÍ_MEZ = 12;

	public static void main(String[] args) throws IllegalArgumentException{
	     fak3();
	}
	
	// ošetření chyb
	public static void fak3() throws IllegalArgumentException{
		 java.util.Scanner vstup = new java.util.Scanner(System.in);
		 System.out.println("Zadej celé číslo: ");
		 int n = vstup.nextInt();		 			 
		 System.out.println("Jeho faktoriál je " + faktoriál2(n));	 
		 		 		 				
	}
	
	// s kontrolou
	public static void fak2(){
		 java.util.Scanner vstup = new java.util.Scanner(System.in);
		 System.out.println("Zadej celé číslo: ");
		 int n = vstup.nextInt();
		 
		 if(n<0 || n>HORNÍ_MEZ){
			 System.out.println("Faktoriál " + n + " není definován");
			 System.exit(0);
		 } else {		     
		     System.out.println("Jeho faktoriál je " + faktoriál(n));	 
		 }		 		 				
	}
	
	// bez kontrol
	public static void fak1(){
		 java.util.Scanner vstup = new java.util.Scanner(System.in);
		 System.out.println("Zadej celé číslo: ");
		 int n = vstup.nextInt();		 
		 
		 int výsledek = faktoriál(n);
		 System.out.println("Jeho faktoriál je " + výsledek);	 		 		 		 				
	}

    public static int faktoriál(int n){
	     int výsledek = 1;
		 while(n>1){
		    výsledek *= n--;
		 }
		 return výsledek;
	}
	
	 public static int faktoriál2(int n) throws IllegalArgumentException{
	     
		 if(n<0 || n>HORNÍ_MEZ){
			 throw new IllegalArgumentException("Parametr mimo meze: " + n);
		 }
		 
		 int výsledek = 1;
		 while(n>1){
		    výsledek *= n--;
		 }
		 return výsledek;
	}
	
	
	
	

}