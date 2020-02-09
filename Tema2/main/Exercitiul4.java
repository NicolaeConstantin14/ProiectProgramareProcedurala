package main;

public class Exercitiul4 {

	public static void main(String[] args) {
		int suma=0;
		for (int i=1; i<10; i++) {
			suma += suma + i;
		}
System.out.println("Suma este: " + suma);
	}
}	
//explicatii:
//ss=suma stanga; sd=suma dreapta; 

//cand i<3: i(1)+1= 1+1 =>i=2 => sd(0) + i(2)=> ss(2) = 2 + 2 =>ss=sd=4
//cand i<4: i(2)+1= 2+1 =>i=3 => sd(4) + i(3)=> ss(4) = 4 + 7 =>ss=sd=11
//cand i<5: i(3)+1= 3+1 =>i=4 => sd(11) + i(4)=> ss(11) = 11 + 15 =>ss=sd=26
//cand i<6: i(4)+1= 4+1 =>i=5 => sd(26) + i(5)=> ss(26) = 26 + 31 =>ss=sd=57
//...