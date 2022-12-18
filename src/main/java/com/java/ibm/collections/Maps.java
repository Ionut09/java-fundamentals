package com.java.ibm.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
	
	public static void main(String[] args) {
		//CREATE Maps
		
		Map<String, Student> students = new TreeMap<>(); //key == String
		Set<String> keySet = students.keySet(); //in Map cheile formeaz un Set
		Map<String, Student> ourStudents1 = Map.of(
			"1921019210921", new Student("Ionut", 30),
			"1901019210921", new Student("Edi", 30),
			"1901363210921", new Student("Alex", 30)
			);
		
		//CREATE
		students.put("1921019210921", new Student("Ionut", 30));
		students.put("1921019210921", new Student("Ion", 30)); //va suprascrie perechea existenta
		students.put("1921019210921", new Student("John", 30));
		System.out.println(students);
		
		students.putIfAbsent("1921019210921", new Student("Johnny", 30));
		System.out.println(students);
		
		//READ
		Student student = students.get("1921019210921"); //new Student("John", 30) --> null if no mapping for key
		Student unknown = students.getOrDefault("1921019210921", new Student("Unknown", 0)); //new Student("John", 30)
		System.out.println("unknown = " + unknown);
		unknown = students.getOrDefault("9999999999", new Student("Unknown", 0)); // new Student("Unknown", 0)
		System.out.println("unknown = " + unknown);
		
		boolean containsKey = students.containsKey("1921019210921"); //true
		String key = "12345";
		if(students.containsKey(key)){
			Student student1 = students.get(key); //garantat student1 != null
		}
		
		//UPDATE
		students.replace("1921019210921", new Student("John", 30), new Student("John", 30));
		students.replace("1921019210921", new Student("John", 30));
		
		//DELETE
		Student removedStudent = students.remove(key);
		boolean removed = students.remove("1921019210921", new Student("Edi", 30)); //false
		
		
		students.put("60112187291872", new Student("Bianca", 21));
		System.out.println("Final form students:" +students);
		
		
	}
}
