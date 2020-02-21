package main;

public class Imobil {

	private String tipCasa;
	private int nrEtaje;
	private double pret;
	
	public Imobil() {
		tipCasa = "Casa";
		nrEtaje = 2;
		pret = 50000.0;
	}
	
	public Imobil(String tipCasa, int nrEtaje, double pret) {
		this.tipCasa = tipCasa;
		this.nrEtaje = nrEtaje;
		this.pret = pret;
	}
	  public Imobil(String tipCasa)
       { 
    	 tipCasa="";
         nrEtaje = 0;
         pret = 0;
       }
		
	public void setTipCasa(String tipCasa) {
		this.tipCasa = tipCasa;
	}
	public String getTipCasa() {
		return this.tipCasa;
	}
	
	public void setNrEtaje(int nrEtaje) {
		this.nrEtaje = nrEtaje;
	}
	public int getNrEtaje() {
		return this.nrEtaje;
	}
	
	public void setPret(double pret) {
		this.pret = pret;
	}
	public double getPret() {
		return this.pret;
	}
	
}
