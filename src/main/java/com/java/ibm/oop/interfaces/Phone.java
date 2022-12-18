package com.java.ibm.oop.interfaces;

public interface Phone {
	
	//	public static final == contstant
	int PHONE_KEYS = 24; //-> variabiliele in interfata sunt constante
	
	public abstract boolean powerOn();
	
	void call();
	
	void answer();
}
