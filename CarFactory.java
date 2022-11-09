package com.te.javabasics;

import java.util.Scanner;

public class CarFactory {
	public static Car getCar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Carname");
		String carname=scanner.next();
		if(carname.equalsIgnoreCase("audi")) {
			return new Audi();
		}
		else if(carname.equalsIgnoreCase("bmw")) {
			return new Bmw();
		}
		else { 
			return null;
			
		}
	}

}
