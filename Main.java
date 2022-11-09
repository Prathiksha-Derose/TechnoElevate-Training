package com.te.javabasics;

public class Main {
	public static void main(String[] args) {
		
		Bike bike = new Bike();
		System.out.println(bike.a);
		bike.r15();
		System.out.println("*********");
		Cycle cycle=new Cycle();
		System.out.println(cycle.a);
		cycle.r15();
		System.out.println("*********");
		Boat boat = new Boat();
		System.out.println(boat.a);
		System.out.println("*********");
		Bike pulsar = cycle;
		System.out.println(pulsar.a);
		pulsar.r15();
		
		
	}

}
