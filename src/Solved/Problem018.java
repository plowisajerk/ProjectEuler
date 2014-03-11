package Solved;

import java.io.BufferedReader;
import java.io.FileReader;

public class Problem018 {

	public static void main(String[] args) {
		// SOLVED
		
		/*
		 *  Maximum path sum
		 */
		
		// i goes down, j goes across
		// i++,j = move left = 0
		// i++,j++ = move right = 1
		int[][] input = new int[15][15];
		int[][] partialSum = new int[15][15];
		
		try {	
			BufferedReader br = new BufferedReader(new FileReader("src//Resources//Problem018.txt"));
			String line;
			line = br.readLine();
			for (int i = 0; line != null && i < 15; i++) {
				for (int j = 0; j <= i; j++) {
					input[i][j] = Integer.parseInt(line.substring(3*j,3*j+2));		// Seems fairly cromulent
				}
				line = br.readLine();
			}
			br.close();
		}
		catch (Exception e) {
			System.out.println("File not found! Need Problem018.txt.");
		}
		for (int j = 0; j < 15; j++) {
			partialSum[14][j] = input[14][j];
		}
		
		
		for (int i = 13; i >= 0; i--) {
			for (int j = 0; j < 14; j++) {
				partialSum[i][j] = input[i][j] + Math.max(partialSum[i+1][j],partialSum[i+1][j+1]);
			}
		}
		
		System.out.println("The answer is: " + partialSum[0][0]);
		
		
	}

}
