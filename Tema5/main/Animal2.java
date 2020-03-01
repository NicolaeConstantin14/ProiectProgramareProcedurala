package main;

public class Animal2 {
	private String tipAnimal;
	private String culoare;
	private int varsta;
	
	public Animal2() {
		this.tipAnimal="";
		this.culoare="";
		this.varsta=0;
	}
	
	public Animal2(String culoare) {
		this.tipAnimal="";
		this.culoare=culoare;
		this.varsta=0;
	}

	public Animal2(String tipAnimal, String culoare, int varsta) {
		this.tipAnimal=tipAnimal;
		this.culoare=culoare;
		this.varsta=varsta;
	}
	
	public void setAnimal(String tipAnimal) {
		this.tipAnimal=tipAnimal;
	}
	
	public void setCuloare(String culoare) {
		this.culoare=culoare;
	}
	
	public void setVarsta(int varsta) {
		this.varsta=varsta;
	}
	
	public String getAnimal() {
		return tipAnimal;
	}
	
	public String getCuloare() {
		return culoare;
	}
	
	public int getVarsta() {
		return varsta;
	}
	
	public String Detalii() {
		return "Animalul de tip "+ tipAnimal + " de culoare "+ culoare + " si varsta "+ varsta;
	}
}
