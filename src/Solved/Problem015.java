package Solved;

public class Problem015 {

	public static void main(String[] args) {
		// SOLVED
		
		/*
		 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
		 * 
		 * How many such routes are there through a 20×20 grid?
		 */
		
		
		long[][] path = new long[21][21];
		for (int i = 0; i < 21; i++) {
			for (int j = 0; j < 21; j++) {
				path[i][j] = 0;
			}
		}
		
		
		long longAssPath = calcPaths(20,20,path);
		
		System.out.println("The answer is: " + longAssPath);
		

	}
	
	public static long calcPaths(int right, int down, long[][] path) {
		if (right == 0 && down == 0) {
			return 0;
		}
		else if (path[right][down] != 0) {
			return path[right][down];
		}
		else if (right == 0) {
			path[right][down] = down;
			return 1;
		}
		else if (down == 0) {
			path[right][down] = right;
			return 1;
		}
		else {
			long currentPath = calcPaths(right-1,down,path) + calcPaths(right,down-1,path);
//			System.out.println("Calculating for a " + right + " x " + down + " grid.");
//			System.out.println("Get " + currentPath + ".");
			path[right][down] = currentPath;
			return currentPath;
		}
		
		
	}
	
}
