package Solved;

public class Problem002 {
	
	public static void main(String[] args) {
		// SOLVED
		
		// Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
		// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
		// By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
		
		
		int fib1 = 1;
		int fib2 = 2;
		int fib3 = 3;
		
		int PartialSum = 0;
		
		while (fib2 < 4000000) {
			PartialSum += fib2;
			
			fib1 = fib2 + fib3;
			fib2 = fib3 + fib1;
			fib3 = fib1 + fib2;
		}
		
		System.out.print("The answer is: ");
		System.out.println(PartialSum);
	}
}
