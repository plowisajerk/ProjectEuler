package Solved;

public class Problem007 {

	public static void main(String[] args) {
		// SOLVED
		
		/* 	
		 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
		 * What is the 10 001st prime number?
		 */ 
		int max = 10001;
		
		int[] prime = new int[max];
		int primeIndex = 0;
		int currentInt = 2;
		double sqrtCurrentInt = Math.sqrt(currentInt);
		boolean currentPrime = true;
		
		while (primeIndex < max) {
			currentPrime = true;
			for (int i = 0; prime[i] != 0 || prime[i] > sqrtCurrentInt; i++) {
				if (currentInt % prime[i] == 0) {
					currentPrime = false;
					break;
				}
			}
			if (currentPrime) {
				prime[primeIndex] = currentInt;
//				System.out.println(currentInt);
				primeIndex++;
			}
			
			currentInt++;
			sqrtCurrentInt = Math.sqrt(currentInt);
		}
		
		System.out.print("The answer is: ");
		System.out.println(prime[max-1]);
		
	}

}
