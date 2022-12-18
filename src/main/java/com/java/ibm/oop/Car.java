package com.java.ibm.oop;

public class Car {
	
	//de clasa -> valoarea variabilelor statice va fi aceeasi pt toate obiectele din clasa
	static int wheels;
	
	//de instanta
	 float fuelLevel; //0.0
	 byte gear = 1;// 0  //-127 : 128
	Engine engine; //null
	String maker = "Invalid";
	
	public Car() {
		this(0.0f, (byte) 1, new Engine(), "Invalid");
	}
	
	public Car(float fuelLevel, byte gear, Engine engine, String maker) {
		this.fuelLevel = fuelLevel;
		this.gear = gear;
		this.engine = engine;
		this.maker = maker;
	}
	
}
