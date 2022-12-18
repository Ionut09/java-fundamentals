package com.java.ibm.variables;

import java.util.Scanner;

public class SwitchEx {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double priceWithoutVAT = 100; //without VAT
		System.out.println("Enter country: \n Only RO, NL and US are supported. ");
		String country = sc.next();
		double priceWithVAT;
		switch (country) {
			case "RO":
			case "BG": {
				priceWithVAT = priceWithoutVAT * 1.19;
				break;
			}
			case "NL": {
				priceWithVAT = priceWithoutVAT * 1.20;
				break;
			}
			case "US": {
				priceWithVAT = priceWithoutVAT;
				break;
			}
			default: {
				priceWithVAT = priceWithoutVAT;
			}
		}
		System.out.println("priceWithoutVAT = " + priceWithoutVAT);
		System.out.println("priceWithVAT = " + priceWithVAT);
	}
	
	private static double computePriceWithVAT(String country, double price){
		/*
		// old way
		switch (country) {
			case "RO":
			case "BG": {
				return price * 1.19;
			}
			case "NL": {
				return price * 1.20;
			}
//			case "US": {
//				return price;
//			}
			default: {
				return price;
			}
		}
		*/
		//after Java 15 way
		return switch (country) {
			case "RO", "BG" -> price * 1.19;
			case "NL" -> price * 1.20;
			default -> price;
		};
	}
}
