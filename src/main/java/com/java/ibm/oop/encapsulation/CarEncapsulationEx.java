package com.java.ibm.oop.encapsulation;

public class CarEncapsulationEx {
	
	public static void main(String[] args) {
		
		Car audi = new Car();
		audi.setGear((byte) 4);//invlid value
		audi.setFuelLevel(55.5f);
		
		System.out.println("audi.fuelLevel: " + audi.getFuelLevel());
		System.out.println("audi.gear: " + audi.getGear());
		
	}
}
