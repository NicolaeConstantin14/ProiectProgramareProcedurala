package main;

public class T3Exercitiul5 {

	 public static void main(String[] args) {
			
			String sir = "string";
			
			StringBuffer sirModificat = new StringBuffer();
			
			char[] caractere = sir.toCharArray();
			
			for (int index = 0; index < caractere.length; index++) {
				
				char c = caractere[index];
				
				if (index % 2 != 0) {
					
					c = Character.toUpperCase(c);
				}
				
				sirModificat.append(c);
			}
			System.out.println("Sirul rezultat este: " + sirModificat.toString());
		   }
	 }
