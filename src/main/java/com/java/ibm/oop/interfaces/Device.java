package com.java.ibm.oop.interfaces;

public interface Device {
	boolean hasPower();
	
	default boolean isSmart(){
		return false;
	}
}
