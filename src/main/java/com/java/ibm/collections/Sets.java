package com.java.ibm.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Set foloseste de equals si hashcode
public class Sets {
	
	public static void main(String[] args) {
		//creating sets
		Set<Student> students = new HashSet<>(); //elemente unice
		Set<String> strs = Set.of("Java", "PHP");
		
		students.add(new Student("Ionut", 30));
		students.add(new Student("Ionut", 30));
		students.add(new Student("Edi", 41));
		students.add(new Student("Edi", 41));
		students.add(new Student("Edi", 41));
		boolean added = students.add(new Student("Edi", 41));
		System.out.println("added = " + added);
		
		System.out.println("new Student(\"Ionut\", 30).equals( new Student(\"Ionut\", 30)) = " + new Student("Ionut", 30).equals(
			new Student("Ionut", 30)));
		//		students.size() == 2
		System.out.println(students);
		
		//CREATE
		boolean addedStudent = students.add(new Student("Alexandrina", 40));
		System.out.println("addedStudent = " + addedStudent);
		
		//READ
		boolean contains = students.contains(new Student("Ionut", 30)); //true
		System.out.println("contains = " + contains);
		
		//UPDATE N/A
		//DELETE
		boolean remove = students.remove(new Student("Ionut", 30)); //true
		
		//TreeSet -> Comparable -> compareTo ( cast la Comparable)
		students = new TreeSet<>();
		students.add(new Student("Ionut", 30));
		students.add(new Student("Ionut", 30));
		students.add(new Student("Edi", 41));
		students.add(new Student("Edi", 41));
		students.add(new Student("Edi", 41));
		students.add(new Student("Alexandrina", 40));
		System.out.println("students = " + students);
		
		//java.util.NavigableSet ?? API
		
		StudentComparator studentComparator = new StudentComparator();
		students = new TreeSet<>(studentComparator);
		students.add(new Student("Ionut", 30));
		students.add(new Student("Ionut", 30));
		students.add(new Student("Edi", 41));
		students.add(new Student("Edi", 41));
		students.add(new Student("Edi", 41));
		students.add(new Student("Alexandrina", 40));
		System.out.println("students sorted with Comparator = " + students);
	}
}
