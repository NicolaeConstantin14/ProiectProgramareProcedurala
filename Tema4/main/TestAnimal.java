package main;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal caine = new Animal("Caine","Alb",1);
		
		Animal pisica = new Animal("Pisica","Negru",2);
		
		
		System.out.println("Tip animal: " + caine.getTipAnimal() + "\nCuloare: " + caine.getCuloare() + "\nVarsta: " + caine.getVarsta() + "\n");
		System.out.println("Tip animal: " + pisica.getTipAnimal() + "\nCuloare: " + pisica.getCuloare() + "\nVarsta: " + pisica.getVarsta()+ "\n");
		
	}

}