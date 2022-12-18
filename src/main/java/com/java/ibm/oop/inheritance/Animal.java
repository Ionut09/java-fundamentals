package com.java.ibm.oop.inheritance;

public class Animal { //extends Object{  in mod implicit
	
	private final double size;
	private final String name;
	private final int weight;
	
	public Animal(double size, String name, int weight) {
		this.size = size;
		this.name = name;
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println("This " + name + " is a bit hungry. It has to eat something.");
	}

	public void move(int speed) {
		System.out.println("This " + name + " moves at speed: "+speed);
	}
	
	public double getSize() {
		return size;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
}
