package main;

public class T3Exercitiul2 {

	public static void main(String[] args) {
		 int[] arr = { 2, 13, 3, 56, 5, 57, 88, 24, 9, 10 };
		  int maxValue = arr[0];
		  int minValue = arr[0];
		  
		  for(int i=1;i < arr.length;i++){
		    if(arr[i] > maxValue){
			  maxValue = arr[i];
			  } 		    
	}
		  for(int i=1;i < arr.length;i++){
			    if(arr[i] < minValue){
				  minValue = arr[i];
		  
	}	  
	}
System.out.println("Valoarea maxima este: " + maxValue); 
System.out.println("Valoarea minima este: " + minValue); 
	}
}