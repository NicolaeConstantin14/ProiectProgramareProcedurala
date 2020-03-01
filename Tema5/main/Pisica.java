  
package main;
public class Pisica extends Animal2 {

	public Pisica() {
		super();
		
	}

	public Pisica(String culoare) {
		super(culoare);
		
	}

	public Pisica(String tipAnimal, String culoare, int varsta) {
		super(tipAnimal, culoare, varsta);
		
	}

	public String Detalii() {
		return "Animal "+ getAnimal()+ " de culoare "+ getCuloare()+ " si varsta "+ getVarsta();
	}
}
