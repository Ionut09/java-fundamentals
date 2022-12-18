package com.java.ibm.oop.encapsulation;

import com.java.ibm.oop.Engine;

public class Car {
	
	//de clasa -> valoarea variabilelor statice va fi aceeasi pt toate obiectele din clasa
	static int wheels;
	
	//de instanta
	private float fuelLevel; //0.0
	private byte gear = 1;// 0  //-127 : 128
	private Engine engine; //null
	private String maker = "Invalid";
	
	public Car() {
		this(0.0f, (byte) 1, new Engine(), "Invalid");
	}
	
	public Car(float fuelLevel, byte gear, Engine engine, String maker) {
		this.fuelLevel = fuelLevel;
		this.gear = gear;
		this.engine = engine;
		this.maker = maker;
	}
	
	public static int getWheels() {
		return wheels;
	}
	
	public static void setWheels(int wheels) {
		Car.wheels = wheels;
	}
	
	public float getFuelLevel() {
		return fuelLevel;
	}
	
	public void setFuelLevel(float fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	
	public byte getGear() {
		return gear;
	}
	
	public void setGear(byte gear) { //bean naming convention set/getFieldName
		if (gear < 1 || gear > 12) {
			System.out.println("Invalid gear value!");
			this.gear = 1;
			return;
		}
		this.gear = gear;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
}
