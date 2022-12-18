package com.java.ibm.variables;

public class VariablesAndOperators {
	
	public static void main(String[] args) {
		
		int num = (int) 217826183233L;
		//		Integer.MAX_VALUE;//2147483647
		//		Integer.MIN_VALUE;
		System.out.println(num); //overflow \/ underflow
		
		char a = 'a';
		char aInt = 97;
		
		for (char c = 'A'; c < 'Z'; c++) {
			System.out.println(c + " -> " + (c + 0));
		}
		
		int i = 3;
		
		i++; // i = i + 1;
		System.out.println(i); //4
		++i;
		System.out.println(i); //5
		//		System.out.println(++i); //i=6 , -> 6
		System.out.println(i++); //i=6 , -> 5
		System.out.println(i);   //i=6 , -> 6
		
		//		while ((i = i + 1) > 1) {
		//			i++;
		//		}
		
		short x = 9; //Short
		
//		i == 6
		boolean shortCircuiting = (i > 4) || (++i < 10); //true , i == 6
		System.out.println("i = " + i); // i ramane 6
	
		String s = null;
//		if((s != null) & s.startsWith("abc")){ //fara shortcircuiting --> NPE(java.lang.NullPointerException)
		if((s != null) && s.startsWith("abc")){ //false
			System.out.println("Bla bla");
		}
	}
}
