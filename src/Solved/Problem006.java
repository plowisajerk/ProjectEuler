package Solved;
public class Problem006 {

	public static void main(String[] args) {
		// SOLVED
		/* 
		 * The sum of the squares of the first ten natural numbers is, (etc)
		 * The square of the sum of the first ten natural numbers is, (etc)
		 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
		 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
		 */
		
		int diff = 0;
		
		for (int i = 1; i <= 100; i++) {
			for (int j = i+1; j <= 100; j++) {
				diff += i*j;
			}
		}
		
		diff *= 2;
		
		System.out.print("The answer is: ");
		System.out.println(diff);
	}

}
