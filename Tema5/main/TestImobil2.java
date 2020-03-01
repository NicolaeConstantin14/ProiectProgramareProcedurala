package main;

public class TestImobil2 {
	
	public static void main(String[] args) {
	
	Imobil imobil1 = new Imobil("apartament", 1, 60000);
	Imobil imobil2 = new Imobil("vila", 2, 100000);
	
	
	System.out.println("Tip Casa: " + imobil1.getTipCasa() + "\nNumar etaje: " + imobil1.getNrEtaje() + "\nPret: " + imobil1.getPret()+ "\n");
	System.out.println("Tip Casa: " + imobil2.getTipCasa() + "\nNumar etaje: " + imobil2.getNrEtaje() + "\nPret: " + imobil2.getPret()+ "\n");
	
	System.out.println("Next:\n");
	
	Apartament apartament1=new Apartament("duplex",3,50000);
	System.out.println("Tip imobil: " + apartament1.getTipCasa() + "\nPret: " + apartament1.getPret() + "\nEtaje: "+ apartament1.getNrEtaje() + "\n");
	System.out.println(apartament1.Detalii() + "\n");
		
	Casa casa1=new Casa("vila",4,60000);
	System.out.println("Tip imobil: " + casa1.getTipCasa() + "\nPret: "+ casa1.getPret() + "\nEtaje: " + casa1.getNrEtaje() + "\n");
	System.out.println(casa1.Detalii());
	
	}
}