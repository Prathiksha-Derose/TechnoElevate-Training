package com.te.javabasics.comparator;

public class InvalidChoiceException extends RuntimeException {
 String msg;

//   String msg;
	public InvalidChoiceException(String msg) {
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
		
	}
   
}
