package com.java.ibm.strings;

// strrts
public class Palindrom {
	
	public static void main(String[] args) {
		String s1; //
		
		s1 = "strrts"; //s - 0, r - 1, ..., s - 5 = 6 -1
		System.out.println("isPalindrom(\"strrts\") = " + isPalindrom2(s1));
		s1 = "dh378hd83h3";
		System.out.println("isPalindrom(\"dh378hd83h3\") = " + isPalindrom2(s1));
	}
	
	private static boolean isPalindrom(String s1) {
		int length = s1.length();
		for (int i = 0; i < length / 2; i++) {
			if (s1.charAt(i) != s1.charAt(length - i - 1)){
				return false;
			}
		}
		return true;
	}
	
	private static boolean isPalindrom2(String s1) {
		StringBuilder stringBuilder = new StringBuilder(s1);
		stringBuilder = stringBuilder.reverse();
		String reversed = stringBuilder.toString();
		
//		return s1 == reversed; //!!!! never do this at home
		return s1.equals(reversed);  //comparam cu equals
	}
}
