package com.java.ibm.oop.interfaces;

public class DeskPhone implements Phone {
	
	private String number;
	private boolean on;
	
	@Override
	public boolean powerOn() {
		on = true;
		return on;
	}
	
	@Override
	public void call() {
	
	}
	
	@Override
	public void answer() {
	
	}
}
