package Solved;
import java.util.Arrays;

public class Problem010 {

	public static void main(String[] args) {
		// SOLVED
		
		/* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
		 * 
		 * Find the sum of all the primes below two million.
		 */
		
		boolean[] prime = new boolean[2000000];
		Arrays.fill(prime,true);
		prime[0]=false;
		prime[1]=false;
		
		double sqrtLength = Math.sqrt(prime.length);
		long partialSum = 0;
		
		for (int i=2; i < sqrtLength; i++) {
			if (prime[i]) {
				for (int j = i+i; j < prime.length; j+=i) {
					prime[j] = false;
				}
			}
		}
		
		
		for (int i = 0; i < prime.length; i++) {
			if (prime[i]) {
				partialSum += i;
			}
		}
		
		System.out.print("The answer is: ");
		System.out.println(partialSum);
		
		
	}

}
