package com.te.javabasics.collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		
	
		ArrayListDemo1 arraylistdemo= new ArrayListDemo1(3);
	

	arraylistdemo.add(10);
	arraylistdemo.add(10);
	arraylistdemo.add(10);
	arraylistdemo.add(10);
	arraylistdemo.add(10);
	arraylistdemo.add(10);
	arraylistdemo.add(10);
	for(int i=0;i<arraylistdemo.size();i++) {
		System.out.println(arraylistdemo.get(i));
		
	}
	}
	
}

