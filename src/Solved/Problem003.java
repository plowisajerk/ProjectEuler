package Solved;
import java.math.BigInteger;


public class Problem003 {

	public static void main(String[] args) {
		// SOLVED
		
		// The prime factors of 13195 are 5, 7, 13 and 29.
		// What is the largest prime factor of the number 600851475143 ?
		
		BigInteger quotient = new BigInteger("600851475143");
		// System.out.println(inputNumber.toString());
		
		BigInteger prime;
		
		for(prime = new BigInteger("1") ; quotient.compareTo(BigInteger.ONE) != 0; ) {
			prime = prime.nextProbablePrime();
			BigInteger mod = quotient.mod(prime);
			while (mod.compareTo(BigInteger.ZERO)== 0) {
				quotient = quotient.divide(prime);				
				mod = quotient.mod(prime);
			}
		}
		
		System.out.print("The answer is: ");
		System.out.println(prime.toString());
	}
}
