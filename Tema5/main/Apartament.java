package main;

public class Apartament extends Imobil {

	public Apartament() {
		super();
		
	}

	public Apartament(String tipCasa, int nrEtaje, double pret) {
		super(tipCasa, nrEtaje, pret);
		
	}
	
	public String Detalii() {
		return "Imobilul de tip "+ getTipCasa()+ " cu "+ getNrEtaje()+ " etaje si pretul "+ getPret();
	}

}