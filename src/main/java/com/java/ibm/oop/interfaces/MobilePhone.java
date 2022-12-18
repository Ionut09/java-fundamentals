package com.java.ibm.oop.interfaces;

public abstract class MobilePhone implements Phone, MobileDevice {
	
	private String number;
	private boolean on;
	
	public static void main(String[] args) {
		MobileDevice mobileDevice = new SmartPhone(); //am suprascris isSmart
		Device device = mobileDevice;
		
		System.out.println("device.isSmart() = " + device.isSmart()); //true
	}
	
	@Override
	public void call() {
		powerOn();
		System.out.println("Mobile phone calling");
	}
	
	@Override
	public void answer() {
		System.out.println("Answering the phone");
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
}
