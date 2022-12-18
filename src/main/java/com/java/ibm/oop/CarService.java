package com.java.ibm.oop;

public class CarService {
	
	public static void main(String[] args) {
		Car audi = new Car();  //this --> audi
		Car.wheels = 4;
		audi.gear = 2;
		audi.fuelLevel = 55.5f;
		audi.maker = "Audi";
		audi.wheels = 6;
		System.out.println("audi.fuelLevel: " + audi.fuelLevel);
		System.out.println("audi.gear: " + audi.gear);
		System.out.println("audi.maker: " + audi.maker);
		System.out.println("audi.engine: " + audi.engine);
		System.out.println("audi.wheels: " + audi.wheels);
		System.out.println();
		
		Car bmw = new Car();   //this --> bmw
		bmw.maker = "BMW";
		bmw.gear = 6;
		System.out.println("bmw.fuelLevel: " + bmw.fuelLevel);
		System.out.println("bmw.gear: " + bmw.gear);
		System.out.println("bmw.maker: " + bmw.maker);
		System.out.println("bmw.engine: " + bmw.engine);
		System.out.println("bmw.wheels: " + bmw.wheels);
		System.out.println("Car.wheels: " + Car.wheels);
		
		
	}
}
