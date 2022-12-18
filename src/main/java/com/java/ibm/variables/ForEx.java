package com.java.ibm.variables;

import java.util.Scanner;

public class ForEx {
	
	//prime
	public static void main(String[] args) {
		
		int[] arr = new int[1000_000]; //  | | | | | | | |
//		arr -> stie unde e arrayul: adresa primei celule
//		    -> length
		
		arr[600000] = 15;
//		adr + 6 * 32 (atat e int) ==> adresa lui arr[6]
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
//		int num = sc.nextInt();
		
//		boolean isPrime = isPrime(num);
		
		for (int i = 3; i < 100; i++) {
			if (isPrime(i)) {
				System.out.println("Number " + i + " is prime!");
			} else {
				System.out.println("Number " + i + " is not prime!");
			}
		}
	}
	
	public static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
