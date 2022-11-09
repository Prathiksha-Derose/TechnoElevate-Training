package com.te.javabasics;

public interface Car {
	public void accelerate();

	public void brakes();

	public void gear();
	
	default void gps() {
		
	}
	
	default void airbag() {
		
		
	}

}
