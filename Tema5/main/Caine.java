package main;
public class Caine extends Animal2 {

	public Caine() {
		super();
		
	}

	public Caine(String culoare) {
		super(culoare);
		
	}

	public Caine(String tipAnimal, String culoare, int varsta) {
		super(tipAnimal, culoare, varsta);
		
	}
	
	public String Detalii() {
		return "Animal "+ getAnimal()+ " de culoare "+ getCuloare()+ " si varsta "+ getVarsta();
	}
}
