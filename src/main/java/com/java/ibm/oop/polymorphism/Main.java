package com.java.ibm.oop.polymorphism;

import com.java.ibm.oop.inheritance.Animal;
import com.java.ibm.oop.inheritance.Dog;
import com.java.ibm.oop.inheritance.Whale;

public class Main {
	
	public static void main(String[] args) {
		Whale mobyDick = new Whale(2000, "Moby Dick", 10000, "Casalot");
		mobyDick.eat();
		mobyDick.swim();
		
		System.out.println();
		//		orca --> referinta: Java vede doar metodele din clasa referintei
		//                 nici nu stie de ce tip e obiectul
		//		new Whale(1500,"Orca", 8000, "Orca") --> obiectul
		final Animal b = new Whale(1500, "Orca", 8000, "Orca");
		
		//		b = new Dog();
		//		unBietAnimal = new Dog();
		
		//aplicatia mea care e client pentru metoda eat
		b.eat();
		Animal c = b;
		System.out.println("anotherReference.getName() before change = " + c.getName());
		
		System.out.println("anotherReference.getName() = " + c.getName());
		
		c = null;
		
		//		b.swim(); won't work
		((Whale) b).swim();
		Whale d = (Whale) b; //Dog ??
		d.swim();
		
		//		(String)b //Inconvertible types; cannot cast 'Animal' to 'java.lang.String'
		Animal whale1 = new Dog();
		if (whale1 instanceof Whale) {
			Whale whale = (Whale) whale1;
			whale.swim();
		} else {
			System.out.println("object is not of type Whale");
		}
		
		System.out.println(whale1 instanceof Dog); //true
		System.out.println(whale1 instanceof Animal); //true
		System.out.println(whale1 instanceof Object); //true
	}
}
