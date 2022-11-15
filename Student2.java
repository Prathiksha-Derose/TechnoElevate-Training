package com.te.javabasics.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
//import java.util.Comparator;

public class Student2 {
	static Scanner sc = new Scanner(System.in);
	static String name;
	int id;
	int age;
	int mark;
	int a;
	static int b;
	static HashSet<Student> arraylist;
	static ArrayList<Student> arraylist1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		arraylist = new HashSet<Student>();
		s1();
		do {
			System.out.println("Do You want to add Elements type 1 or 0");
			a = sc.nextInt();
			if (a == 1) {
				s1();
			} else {
				a = 0;
				for (Student de : arraylist) {
					System.out.println(de);
				}
			}
		} while (a == 1);
		m1();
		
	}

	public static void m1() {
		arraylist1=new ArrayList<Student>();

		System.out.println("Enter your Choice for Sorting");
		int a = sc.nextInt();

		switch (a) {

		case 1:
			System.out.println("sorting by id");
			Collections.sort(arraylist1, new StudentId());
			for (Student std : arraylist1) {
				System.out.println(std);
			}
			break;
		case 2:
			System.out.println(" sorting by Name");
			Collections.sort(arraylist1, new StudentName());
			for (Student std : arraylist1) {
				System.out.println(std);
			}
			break;
		case 3:
			System.out.println(" sorting by Age");
			Collections.sort(arraylist1, new StudentName());
			for (Student std : arraylist1) {
				System.out.println(std);
			}
			break;
		case 4:
			System.out.println(" sorting by Marks");
			Collections.sort(arraylist1, new StudentName());
			for (Student std : arraylist1) {
				System.out.println(std);
			}
			break;
		default:
			System.out.println("Invalid Choice");
		}
		do {
			System.out.println("***************************************");
			System.out.println("Do You want to continue sorting");
			System.out.println("if Yes type 1 or No type 0");
			b = sc.nextInt();
			if (b == 1) {
				m1();
			} else {
				System.out.println("You have not selected Yes or Y");
			}
		} while (b == 1);
	}

	public static void s1() {
		System.out.println("Enter the Name");
		String name = sc.next();
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the mark");
		int mark = sc.nextInt();
		System.out.println("Enter the Age");
		int age = sc.nextInt();
		arraylist.add(new Student(name, id, mark, age));
//			return arraylist;
	}

}