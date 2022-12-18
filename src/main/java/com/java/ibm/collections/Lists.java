package com.java.ibm.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lists {
	
	static int i;
	
	public static void main(String[] args) {
		
		//creating lists
		List<String> langs = new ArrayList<>();
		List<String> langs1 = List.of("Java", "PHP", "C++");//unmodifiable
		List<String> langs2 = Arrays.asList("Java", "PHP", "C++");
		//		                    = {"Java", "PHP", "C++"}; //literal pentru array
		
		String[] arrayMaiVechi = {"Java", "PHP", "C++"};
		List<String> list = List.of(arrayMaiVechi);
		List<String> strings = Arrays.asList(arrayMaiVechi);
		
		//CREATE
		langs.add("Java"); //[Java]
		langs.add("PHP"); //[Java, PHP] ...
		langs.add(0, "C++"); //[C++, Java, PHP] ...
		
		//READ
		String element = langs.get(0); //C++
		boolean containsPHP = langs.contains("PHP"); //true
		int indexOfJava = langs.indexOf("Java");//1
		int lastIndexOfPHP = langs.lastIndexOf("PHP"); //2
		
		//UPDATE
		langs.set(0, "JAVA");
		langs.set(1, "C++");
		System.out.println("langs = " + langs); //toString --> Object
		
		//REMOVE
		//		langs.remove("C++"); //[JAVA, PHP]
		langs.remove(1); //[JAVA, PHP]
		System.out.println("langs = " + langs);
		
		langs.add(3 + "");
		
		List<Integer> ints = new ArrayList<>();
		ints.add(1);  //int, autoboxing = auto conversion int <-> Integer
		ints.add(2);
		ints.add(3);
		ints.add(-1);
		ints.add(-4);
		ints.add(-6);
		
		Integer removedElement = ints.remove(1);  //int -> remove(int)   // []
		Integer i = 1;
		ints.remove(i);     // [3]
		Integer i1 = Integer.valueOf(1);
		
		System.out.println(ints);
		ints.removeIf( elementAlListei -> { //boolean test(Integer element)
			System.out.println("elementAlListei = " + elementAlListei);
			return elementAlListei % 2 == 0;
		});
		System.out.println(ints);
		
//		Collections.sort(ints);
		ints.sort(Comparator.naturalOrder());
		System.out.println("sorted ints = " + ints);
		
		
		//		List langs = new ArrayList();
		//		langs.add("Java");
		//		langs.add(5); //java.lang.Integer
		//		langs.add(LocalDate.now()); //2007-12-03
		//		Object java = langs.get(0);
		//		System.out.println("java = " + java);
		//		Object str = langs.get(1);
		//
		//		if (str instanceof String) {
		//			String strCasted = (String) str;
		//		} else if (str instanceof Integer) {
		//			Integer intg = (Integer) str;
		//			System.out.println(str + " is integer");
		//		}
		
	}
}
