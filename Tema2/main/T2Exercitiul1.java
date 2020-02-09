package main;

public class T2Exercitiul1 {

	public static void main(String[] args) {
		int a=3;
		int b=(a=2)*a;
		int c=b*(b=5);
		//System.out.println("a=" + a , "b=" + b ,"c=" + c);
		
		System.out.println("a="+ a + " b="+ b+" c=" +c);
		
		//System.out.printf("a=%d\n",a);
		//System.out.printf("b=%d\n",b);
		//System.out.printf("c=%d\n",c);
	}
//explicatii:
	//1. operatorul pe siruri este "+"; "," se foloseste pentru insiruirea argumentelor iar din println va rezulta un string
}
	