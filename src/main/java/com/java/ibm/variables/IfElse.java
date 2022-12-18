package com.java.ibm.variables;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double basePay;
		double hours;
		
		System.out.println("Enter basePay value: ");
		basePay = sc.nextDouble();
		System.out.println("Enter number of hours worked: ");
		hours = sc.nextDouble();
		
		if (basePay < 10) {
			System.out.println("Min wage is $10/h");
		} else if (hours > 40) {
			System.out.println("You cannot work more than 40 hours per week!");
		} else {
			double pay = basePay * hours;
			System.out.println("Pay employee with $" + pay);
		}
		
		//ternar
		double pay;
		if (basePay < 10) {
			pay = 400;
		} else {
			pay = basePay * hours;
		}
		// <==>
		pay = (basePay < 10) ? 400 : basePay * hours;
		
		
	}
}
