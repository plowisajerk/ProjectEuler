package Solved;

public class Problem001 {

	public static void main(String[] args) {
		// SOLVED
		
		// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
		// Find the sum of all the multiples of 3 or 5 below 1000.
		
		
		int PartialSum = 0;
		
		
		// Multiples of 3
		for (int i = 3; i < 1000; i+= 3) {
			PartialSum += i;
		}
		
		// Multiples of 5 that aren't multiples of 3
		for (int j = 5; j<1000; j+=15) {
			PartialSum += 2*j +5;
		}
		PartialSum -= 1000;
		
		System.out.print("The answer is: ");
		System.out.println(PartialSum);
		
	}

}
