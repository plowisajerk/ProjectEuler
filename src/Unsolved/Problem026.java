package Unsolved;

import plow.*;

public class Problem026 {

	public static void main(String[] args) {
		// UNSOLVED
		
		/*
		 * Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
		 */
		
		
		int maxReciprocal = 2;
		int maxLength = 1;

		
		
		for (int d = 3; d < 100; d++) {
			int currentLength = 0;
			List digits= new List();
			
			
			
			currentLength = digits.length();
			
			if (currentLength > maxLength) {
				maxLength = currentLength;
				maxReciprocal = d;
			}
			System.out.println("");
		}
		
		
		
		System.out.println("The answer is: " + maxReciprocal);
	}

}
