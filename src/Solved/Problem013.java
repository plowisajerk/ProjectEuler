package Solved;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;



public class Problem013 {

	public static void main(String[] args) {
		// SOLVED
		 /*
		  *  Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
		  */
		
		String[] input = new String[100];
		

		try {	
			BufferedReader br = new BufferedReader(new FileReader("src//Resources//Problem013.txt"));
			String line;
			int i = 0;
			while ((line = br.readLine()) != null) {
				input[i] = line;
				i++;
			}
			br.close();
		}
		catch (Exception e) {
			System.out.println("File not found! Need Problem013.txt, mang.");
		}
		
		
		BigInteger partialSum = BigInteger.ZERO;
		String answer;
		
		for (int i = 0; i < 100; i++) {
			partialSum = partialSum.add(new BigInteger(input[i]));
		}
		
		answer = partialSum.toString().substring(0,10);
		
		
		System.out.println("The answer is: " + answer);
		
		
	}

}
