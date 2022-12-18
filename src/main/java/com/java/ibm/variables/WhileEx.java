package com.java.ibm.variables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WhileEx {
	
	public static void main(String[] args) {
		//		System.out.println(21652651/10);
		//		System.out.println(2165265/10);
		//		System.out.println(216526/10);
		//		System.out.println(21652/10);
		//		System.out.println(2165/10);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int num = sc.nextInt(); //21652651
		int numForLength = num;
		int numForStringDigits = num;
		int length = 0;
		while (numForLength != 0) {
			numForLength = numForLength / 10;
			length++;
		}
		
		//100000 -> 10^5 + 1
		int lengthOfDigits = (int) (Math.log10(num) + 1);
		int[] digits = new int[lengthOfDigits];
		
		String numAsString = num + "";
		lengthOfDigits = numAsString.length();
		
		while (num != 0) {
			int digit = num % 10; //-> 1
			digits[lengthOfDigits - 1] = digit;
			lengthOfDigits--;
			num = num / 10;
		}
		
		String digitsString = "";
		while (numForStringDigits != 0) {
			int digit = numForStringDigits % 10; //-> 1
			digitsString += digit;
			numForStringDigits = numForStringDigits / 10;
		}
		
		System.out.println(Arrays.toString(digits));
		System.out.println(new StringBuilder(digitsString).reverse());
		
	}
	
}
