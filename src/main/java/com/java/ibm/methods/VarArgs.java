package com.java.ibm.methods;

import com.java.ibm.variables.ForEx;

public class VarArgs {
	
	public static void main(String[] args) {
		String primes = getPrimes();
		primes = getPrimes(2,4,56,79);
		primes = getPrimes(79);
		System.out.println("primes = " + primes);
	}
	
	private static String getPrimes(int... numbers) {
		String primes = "";
		for (int number : numbers) {
			if (ForEx.isPrime(number)) {
				primes = primes + number + ", ";
			}
		}
		return primes;
	}
}


