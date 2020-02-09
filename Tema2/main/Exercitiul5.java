package main;

public class Exercitiul5 {

	public static void main(String[] args) {
		int i=1;
		int nfactorial=1;
		int n=13;
		for (i=1;i<=n;i++) {
			nfactorial=nfactorial * i;
			
		}
		 System.out.println("n! de "+n+" este: "+nfactorial);
	}

}
//cand n=2: i(1)+1= 1+1 =>i=2 => nfactorial(1) * i(2)=> nfactorial = 2
//cand n=3: i(2)+1= 2+1 =>i=3 => nfactorial(2) * i(3)=> nfactorial = 6
//cand n=4: i(3)+1= 3+1 =>i=4 => nfactorial(6) * i(4)=> nfactorial = 24
//cand n=5: i(4)+1= 4+1 =>i+5 => ....