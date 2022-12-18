package com.java.ibm.exceptions;

public class Student {
	
	private String name;
	private int grade;
	
	public Student(String name, int grade) {
		this.name = name;
		setGrade(grade);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {//1 - 10
		if (grade < 1 || grade > 10) {
			throw new IllegalArgumentException("Invalid grade: " + grade + ". Grade should be between 1 - 10");
		}
		this.grade = grade;
	}
}
