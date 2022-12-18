package com.java.ibm.collections;

public class Student implements Comparable<Student> {
	
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//  getClass().getName() + '@' + Integer.toHexString(hashCode())
	@Override
	public String toString() {
		return "Student[name: " + this.name + ", age: " + this.age + "]";
	}
	
	@Override //optional
	public boolean equals(Object otherStudent) {
		Student otherStudent1 = (Student) otherStudent;
		return this.name.equals(otherStudent1.name);
//			       && this.age == ((Student) otherStudent).age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() ;
//			       + age * 123;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
}
