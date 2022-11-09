package com.te.javabasics.stringclass;

public class FloatString {
	public static void main(String[] args){
		Float val = 14.7f;
		System.out.println(val);
		System.out.println(val.getClass().getName());
		// Float to String
		String str = String.valueOf(val);
		System.out.println(str);
		System.out.println(str.getClass().getName());
	}
}
