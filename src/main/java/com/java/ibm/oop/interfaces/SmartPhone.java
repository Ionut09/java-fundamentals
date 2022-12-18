package com.java.ibm.oop.interfaces;

public class SmartPhone extends MobilePhone {
	
	private int chargeLevel;
	
	@Override
	public boolean powerOn() {
		setOn(true);
		return true;
	}
	
	@Override
	public boolean hasPower() {
		return chargeLevel > 10;
	}
	
	public boolean isSmart(){
		return true;
	}
}
