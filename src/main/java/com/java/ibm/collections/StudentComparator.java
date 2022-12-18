package com.java.ibm.collections;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
	
	@Override
	// neg : o1 < o2
	// 0 : o1 == o2
	// pos : o1 > o2
	public int compare(Student o1, Student o2) {
		return o1.getAge() - o2.getAge();
	}
}
