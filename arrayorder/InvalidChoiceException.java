package com.te.javabasics.arrayorder;

public class InvalidChoiceException extends RuntimeException {
	
	String message;
	public InvalidChoiceException(String message) {
		//super(message);
		this.message=message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}

}
