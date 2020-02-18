package main;

public class TestImobil {

	public static void main(String[] args) {
		Imobil imobil1 = new Imobil();
		Imobil imobil2 = new Imobil("apartament", 1, 60000);
		Imobil imobil3 = new Imobil("vila", 3, 100000);
		
		System.out.println("Tip Casa: " + imobil1.getTipCasa() + "\nNumar etaje: " + imobil1.getNrEtaje() + "\nPret: " + imobil1.getPret()+ "\n");
		System.out.println("Tip Casa: " + imobil2.getTipCasa() + "\nNumar etaje: " + imobil2.getNrEtaje() + "\nPret: " + imobil2.getPret()+ "\n");
		System.out.println("Tip Casa: " + imobil3.getTipCasa() + "\nNumar etaje: " + imobil3.getNrEtaje() + "\nPret: " + imobil3.getPret()+ "\n");
		
	}

}
