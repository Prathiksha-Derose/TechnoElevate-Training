package com.te.javabasics.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentTest {
	static Scanner sc=new Scanner(System.in);
	static int a;
	int b;
	ArrayList<Student>	arraylist;
	public void m1() {
		Student student1=new Student("Lily",01,80,15);
	 Student student2=new Student("Rose",07,87,14);
	  Student student3=new Student("Jasmine",10,85,19);
	  Student student4=new Student("Violet",04,84,20);
	  Student student5=new Student("August",06,79,16);
   	Student student6=new Student("Sarah",05,99,18);
	arraylist =new ArrayList<Student>();
	arraylist.add(student1);
	arraylist.add(student2);
	arraylist.add(student3);
	arraylist.add(student4);
	arraylist.add(student5);
	arraylist.add(student6);
	System.out.println("Before Sorting");
     for(Student std:arraylist) {
    	 System.out.println(std);
     }
     m2();
	}
     public void m2() {

     System.out.println("Enter your Choice");
     int a=sc.nextInt();
     
     switch(a) {
     
     
     case 1:
    	 System.out.println("sorting by id");
   Collections.sort(arraylist, new StudentId());
     for(Student std:arraylist) {
    	 System.out.println(std);
    	}
     break;
     case 2:
    	 System.out.println(" sorting by Name");
     Collections.sort(arraylist, new StudentName());
     for(Student std:arraylist) {
    	 System.out.println(std);
    	 }
     break;
     case 3:
    	 System.out.println(" sorting by Age");
     Collections.sort(arraylist, new StudentName());
     for(Student std:arraylist) {
    	 System.out.println(std);
    	  }
     break;
     case 4: 
    	 System.out.println(" sorting by Marks");
     Collections.sort(arraylist, new StudentName());
     for(Student std:arraylist) {
    	 System.out.println(std);
    	 }
     break;
     default :System.out.println("Invalid Choice");
     }
   do {   System.out.println("***************************************");
	     System.out.println("Do You want to continue sorting");
    	 System.out.println("if Yes type 1 or No type 0");
    	  b=sc.nextInt();
    	 if(b==1) {
    		 m2();
    	 }
    	 else
    	 {
    		 System.out.println("You have not selected Yes or Y");
    	 }
	}while(b==1);
}
}
   
     


	



