package com.java.ibm.oop.inheritance;

public class Dog extends Animal {
	
	private String breed;
	
	public Dog() { //There is no default constructor available in 'Animal' class
		super(50, "Dog", 30);//apel catre constructorul clasei parinte
		//exist pt a garanta constructia membrilor mosteniti de la clasa parinte
	}
	
	public Dog(String breed) {
		//		super(); //asa e by default
		super(60, "Ciobanila", 70);
		this.breed = breed;
	}
	
	public static void main(String[] args) {
		Dog puppy = new Dog();
		
		puppy.eat();
		System.out.println(puppy.getSize());
		System.out.println(puppy.getName());
		
		Dog puppy2 = new Dog("ciobanesc");
		System.out.println(puppy2.getSize());
		System.out.println(puppy2.getName());
	}
	
	public void eat() {
		System.out.println("Dogs eat hup hup");
	}
	
	public void bark() {
		System.out.println("Huf huf");
	}
}
