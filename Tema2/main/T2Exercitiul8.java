package main;
import java.util.Scanner;
public class T2Exercitiul8 {

	public static void main(String[] args) {
		System.out.println("Insereaza numarul zilei din saptamana, de la 1 la 7:");
        Scanner input = new Scanner(System.in);
        int zi;
        zi = input.nextInt();
	        
	        switch(zi)
	        {
	            case 1:
	                System.out.println("Luni");
	                break;
	            case 2:
	                System.out.println("Marti");
	                break;
	            case 3:
	                System.out.println("Miercuri");
	                break;
	            case 4:
	                System.out.println("Joi");
	                break;
	            case 5:
	                System.out.println("Vineri");
	                break;
	            case 6:
	                System.out.println("Sambata");
	                break;
	            case 7:
	                System.out.println("Duminica");
	                break;
	        }
	        input.close();
	}
	
}
