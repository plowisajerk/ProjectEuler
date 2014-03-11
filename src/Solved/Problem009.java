package Solved;

public class Problem009 {
	
	public static void main(String[] args) {
		// SOLVED
		
		/* A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
		 *  a2 + b2 = c2
		 *  For example, 32 + 42 = 9 + 16 = 25 = 52.
		 *  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
		 *  Find the product abc.
		 */
		
		int a=0;
		int b=0;
		int c=0;
		int abSum = 0;
		boolean looking = true;		
		
		for (abSum = 7; abSum < 1000 && looking; abSum++) {
			for (a = 3; a < abSum/2; a++) {
				b = abSum - a;
				c = 1000 - abSum;
				
				if (a*a + b*b == c*c) {
					looking = false;
					break;
				}
			}
		}
		
		System.out.println(a + "^2 + " + b + "^2 = " + c + "^2");
		System.out.print("The answer is: ");
		System.out.println(a*b*c);
	
	}
}
