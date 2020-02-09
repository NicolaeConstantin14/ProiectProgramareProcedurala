package main;

public class T2Exercitiul2 {

	public static void main(String[] args) {
		double d=2.95;
		int i=4;
		System.out.println(++d>i?d:i);
		}
	//explicatii: 
			//1. daca "d" cu valoare 2.95 incrementat cu 1 este mai mare decat "i" cu valoare 4 se va afisa "d", altfel se va afisa "i"
			//2. rezultatul afisat este valoarea lui "i", deoarece 3.95 < 4
}
