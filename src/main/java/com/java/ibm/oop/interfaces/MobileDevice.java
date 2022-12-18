package com.java.ibm.oop.interfaces;

public interface MobileDevice extends Device{
	boolean HAS_BATTERY = true;
	
	default boolean hasPowerIndicator(){ //metodelor de instanta == ne-statice
		return true;
	}
	
	static boolean hasBattery(){ //
		return true;
	}
}
