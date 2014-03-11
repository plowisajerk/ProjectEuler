package Solved;

public class Problem004 {

	public static void main(String[] args) {
		// SOLVED
		
		/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

		Find the largest palindrome made from the product of two 3-digit numbers. */
		
		int i = 0;
		int j = 0;
		int pal = 0;
		
		for (int N = 1998; N >= 200; N--) {
			i = N/2;
			if (N % 2 == 0) {
				j = N/2;
			}
			else {
				j = N/2+1;
			}
			while (i < 1000 && j < 1000) {
				pal = i*j;
				if (isPalindrome(pal)) {
					break;
				}
				else {
					i--;
					j++;
				}
			}
			if (isPalindrome(pal)) {
				break;
			}
		}
		
		System.out.print("The answer is: ");
		System.out.print(i + " x " + j + " = " + pal);

	}
	
	static boolean isPalindrome(int n) {
		if (n < 0) {
			return false;
		}
		else if (n == 0) {
			return true;
		}
		else if (n < 10) {
			return true;
		}
		String nStr = Integer.toString(n);
		
		return isPalindrome(nStr);
	}
	static boolean isPalindrome(String s) {
		if (s.length() < 2) {
			return true;
		}
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length()-i-1)) {
				return false;
			}
		}
		return true;
	}

}
