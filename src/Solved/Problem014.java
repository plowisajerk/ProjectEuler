package Solved;

import java.util.Arrays;

public class Problem014 {

	public static void main(String[] args) {
		// SOLVED with typecasting bullshit
		
		/*
		 * The following iterative sequence is defined for the set of positive integers:
		 * n -> n/2 (n is even)
		 * n -> 3n + 1 (n is odd)
		 * Using the rule above and starting with 13, we generate the following sequence:
		 * 
		 * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
		 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
		 * 
		 * Which starting number, under one million, produces the longest chain?
		 * 
		 * NOTE: Once the chain starts the terms are allowed to go above one million.
		 */
		
		int maxIndex = 0;
		int[] sequence = new int[1000001];
		Arrays.fill(sequence, 0);;
		
		sequence[0] = 1;
		sequence[1] = 1;
		
		for (int i = 2; i < sequence.length; i++) {
			int thisLength = 1;
			long element = i;
			int intElement = i;
			
			while (element >= 1000001 || sequence[(int)element] == 0) {
				element = collatz(element);
				thisLength++;
			}
			intElement = (int)element;
			sequence[i] = sequence[intElement] + thisLength;
			
			if (sequence[i] > sequence[maxIndex]) {
				maxIndex = i;
			}
		}
		
		
		System.out.println("The answer is: " + maxIndex);
		
	}
	
	static long collatz(long n) {
		if (n %2 == 0) {
			return n/2;
		}
		else {
			return 3*n +1;
		}
	}

}
