package main;

public class Imobil2 {
	private String tipCasa;
	private int nrEtaje;
	private double pret;
	
	public Imobil2() {
		this.tipCasa="";
		this.nrEtaje=0;
		this.pret=0;
	}
	public Imobil2(String tipCasa, int nrEtaje, double pret) {
		this.tipCasa = tipCasa;
		this.nrEtaje = nrEtaje;
		this.pret = pret;
	}
	
	public String getTipCasa() {
		return tipCasa;
	}
	
	public void setTipCasa(String tipCasa) {
		this.tipCasa = tipCasa;
	}
	
	public int getNrEtaje() {
		return nrEtaje;
	}
	
	public void setNrEtaje(int nrEtaje) {
		this.nrEtaje = nrEtaje;
	}
	
	public double getPret() {
		return pret;
	}
	
	public void setPret(double pret) {
		this.pret = pret;
	}
	
	public String Detalii() {
		return "Imobil de tip "+ tipCasa + " avand "+ nrEtaje + " etaje si pretul "+ pret;
	}
	
}