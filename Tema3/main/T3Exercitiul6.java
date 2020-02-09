package main;
public class T3Exercitiul6 {

	public static void main(String[] args) {
		
		
		int[] iArray = new int[] {1, 2, 3};
		double[] dArray = new double[iArray.length];
		double dNumar = 1.01;
		
		for(int i=0; i<iArray.length; i++) {
			dArray[i] = iArray[i] + dNumar;
		}		
		for(int i=0; i<dArray.length; i++) { 
			System.out.println(dArray[i]);
		}

	}
}



