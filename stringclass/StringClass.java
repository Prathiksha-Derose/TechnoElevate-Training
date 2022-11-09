package com.te.javabasics.stringclass;

public class StringClass {
public static void main(String[] args) {
	String s1="Hey";
	String s2="Hi";
	String s3=new String("Hey");
	// Working of tostring()//
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	//Working of hashcode()//
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	//Working of equals(object obj)
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1==s3);
}
}
