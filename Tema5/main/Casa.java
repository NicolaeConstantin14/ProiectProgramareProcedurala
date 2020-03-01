package main;
public class Casa extends Imobil {

	public Casa() {
		super();
		
	}

	public Casa(String tipCasa, int nrEtaje, double pret) {
		super(tipCasa, nrEtaje, pret);
		
	}
	public String Detalii() {
		return "Imobilul de tip "+ getTipCasa()+ " cu "+ getNrEtaje()+ " etaje si pretul de "+ getPret();
	}
}