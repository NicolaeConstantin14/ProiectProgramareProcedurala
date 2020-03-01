package main;
public class TestAnimal2 {

	public static void main(String[] args) {
			Animal2 animal1=new Animal2();
			
			animal1.setAnimal("caine");
			animal1.setCuloare("alb");
			animal1.setVarsta(1);
			System.out.println("Animalul: " + animal1.getAnimal() + "\nCuloare: " + animal1.getCuloare() + "\nVarsta: " + animal1.getVarsta() + "\n");

			Animal2 animal2=new Animal2("alb");
			animal2.setAnimal("pisica");
			animal2.setVarsta(2);
			System.out.println("Animalul: " + animal2.getAnimal() + "\nCuloare: " + animal2.getCuloare() + "\nVarsta: " + animal2.getVarsta() + "\n");
	
			System.out.println("Next:\n");
			
		
			Caine caine1=new Caine("caine","negru",3);
			System.out.println("Animalul: " + caine1.getAnimal() + "\nCuloare: " + caine1.getCuloare() + "\nVarsta: " + caine1.getVarsta() + "\n");
			System.out.println(caine1.Detalii() + "\n");
			
			Pisica pisica1=new Pisica("pisica","negru",4);
			System.out.println("Animalul: " + pisica1.getAnimal() + "\nCuloare: " + pisica1.getCuloare() + "\nVarsta: " + pisica1.getVarsta() + "\n");
			System.out.println(pisica1.Detalii());
			
			
	}

}
