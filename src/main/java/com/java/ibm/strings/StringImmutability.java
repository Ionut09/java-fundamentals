package com.java.ibm.strings;

public class StringImmutability {
	
	public static void main(String[] args) {
		
		String first = "abcdef";
		
		String input = "abcdef"; //--> string pool
		System.out.println(first == input);
		input = new String("abcdef"); //--> heap
		System.out.println(first == input);
		
		String input2 = input;
		System.out.println(input2 == input);
		
		input.toUpperCase(); //obiectul existent nu e modficat, este creat unul nou
		//		input = input.toUpperCase();
		System.out.println("input = " + input);
		
		String numbers = "";
		for (int i = 0; i < 10; i++) { //BAD
			numbers += i;
			System.out.println("numbers = " + numbers);
		}
		
		StringBuilder numberBuilder = new StringBuilder();
		for (int i = 0; i < 100; i++) { //BAD
			numberBuilder.append(i);
//			System.out.println("numbersBuilder = " + numberBuilder);
		}
	}
}
