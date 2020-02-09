package main;
import java.util.Scanner;
public class Exercitiul7 {

	public static void main(String[] args) {
		 System.out.println("Insereaza un numar:");
	        Scanner input = new Scanner(System.in);
	        int i;
	        i = input.nextInt();
	         if (i % 2==0){
	             System.out.println("Numarul introdus este par");
	         }
	         else{
	             System.out.println("Numarul introdus este impar");
	            
	        }
	         input.close();
//explicatii:
//daca numarul introdus este divizibil cu 2 atunci este numar par, altfel este numar impar
	}

}
