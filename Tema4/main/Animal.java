package main;

public class Animal {

	private String tipAnimal;
	private String culoare;
	private int varsta;
		
	public Animal(String tipAnimal, String culoare) {
		this.tipAnimal = tipAnimal;
		this.culoare = culoare;
		this.varsta = 0;
	}
	
	public Animal(String tipAnimal, String culoare, int varsta) {
		this.tipAnimal = tipAnimal;
		this.culoare = culoare;
		this.varsta = varsta;
	}
	
	public void setTipAnimal(String tipAnimal) {
		this.tipAnimal=tipAnimal;
		}
	public String getTipAnimal() {
		return tipAnimal;
	}
	
	
	public void setCuloare(String culoare) {
	this.culoare=culoare;
	}
	public String getCuloare() {
		return culoare;
	}
	
	public void setVarsta(int varsta) {
	this.varsta=varsta;
	}
	public int getVarsta() {
		return varsta;
	}
	
}
