package com.java.ibm.oop.inheritance;

public class Whale extends Animal {
	
	private String type;
	
	public Whale(double size, String name, int weight, String type) {
		super(size, name, weight);
		this.type = type;
	}
	
	public void swim(){
		System.out.println("Whales swim, they don't walk!");
	}
	
	public void eat(){ //method overriding
		System.out.println("Whales eat by filtering water. ");
	}
	
	public static void main(String[] args) {
		Whale mobyDick = new Whale(2000,"Moby Dick", 10000, "Casalot");
		System.out.println("mobyDick.getSize() = " + mobyDick.getSize());
		System.out.println("mobyDick.getName() = " + mobyDick.getName());
		System.out.println("mobyDick.getWeight() = " + mobyDick.getWeight());
	}
}
