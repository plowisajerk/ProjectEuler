package Unsolved;

import java.util.Arrays;

import plow.*;
import Exceptions.*;

public class Problem023 {

	public static void main(String[] args) {
		// SOLVED
		
		/*
		 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

		 */
		List abundant = new List();
		for (int i = 2; i < 28123; i++) {
			if (sumProperDivisors(i) > i) {
				abundant.slip(i);
			}
		}
		
		int[] abundantArray = new int[abundant.length()];
		try {
			for (int i = 0; i < abundantArray.length; i++) {
				abundantArray[i] = abundant.pop();
			}
		}
		catch (EmptyStackException e) {
			return;
		}
		
		
		
		boolean[] sieve = new boolean[28123];
		Arrays.fill(sieve,false);
		
		for (int i = 0; i < abundantArray.length; i++) {
			for (int j = 0; j < abundantArray.length; j++) {
				if (abundantArray[i] + abundantArray[j] < sieve.length){
					sieve[abundantArray[i] + abundantArray[j]] = true;
				}
			}
		}
		int partialSum = 0;
		for (int i = 0; i < sieve.length; i++) {
			if (! sieve[i]) {
				partialSum += i;
			}
		}
		System.out.println("The answer is: " + partialSum);
		
	}
	static int sumProperDivisors(int a) {
		int sum = 0;
		for (int i = 1; i <= a/2; i++) {
			if (a % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}