package main;

public class Exercitiul6 {

	public static void main(String[] args) {
		
			 int a=3, b=2, c=1;
			 if (Math.min(a, b) < Math.min(b, c)) {
				 System.out.println("Cel mai mic numar alocat lui a, b sau c este: " + Math.min(a, b));}
			 else {
				 System.out.println("Cel mai mic numar alocat lui a, b sau c este: " + Math.min(b, c));}
			}
	//explicatii:
	//1. daca cel mai mic numar dintre a si b este mai mic decat cel mai mic numar dintre b si c, afiseaza cel mai mic numar dintre a si b, altfel afiseaza cel mai mic numar dintre b si c
}