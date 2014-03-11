package Solved;

import java.math.BigInteger;

public class Problem020 {

	public static void main(String[] args) {
		// SOLVED
		
		/*
		 * 	Find the sum of the digits in the number 100!
		 */
		
		
		BigInteger factorial = BigInteger.ONE;
		
		for (int i = 2; i <= 100; i++) {
			factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
		}
		String fact = factorial.toString();
		int partialSum = 0;
		
		for (int i = 0; i < fact.length(); i++) {
			partialSum += Integer.parseInt(fact.substring(i,i+1));
		}
		
		System.out.println("The answer is: " + partialSum);
	}

}
