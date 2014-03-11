package Solved;

public class Problem005 {

	public static void main(String[] args) {
		// SOLVED
		
		/* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
		 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
		 * 
		 */
		
		long n = 2 * 2 * 2 * 2 * 3 * 3 * 5 * 7  * 11 * 13 * 17 * 19;
		
		boolean succeed = true;
		for (int i = 1; i <= 20; i++) {
			if (n % i != 0) {
				succeed = false;
			}
		}
		if (succeed) {
			System.out.print("The answer is: ");
			System.out.print(n);
		}
		
		
	}

}
