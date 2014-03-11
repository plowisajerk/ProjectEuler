package Unsolved;

import java.math.BigInteger;

public class Problem025 {

	public static void main(String[] args) {
		// SOLVED
		
		
		/*
		 * Find the first 1000 digit Fibonacci number
		 */
		
		BigInteger fib1 = BigInteger.ONE;
		BigInteger fib2 = new BigInteger("2");
		BigInteger fib3 = new BigInteger("3");
		int term = 4;
		
		while (true) {
			
			term++;
			fib1 = fib2.add(fib3);
			if (fib1.toString().length() >= 1000) {
				break;
			}
			
			term++;
			fib2 = fib3.add(fib1);
			if (fib2.toString().length() >= 1000) {
				break;
			}
			
			term++;
			fib3 = fib1.add(fib2);
			if (fib3.toString().length() >= 1000) {
				break;
			}
		}
		
		System.out.println("The answer is: " + term);

	}

}
