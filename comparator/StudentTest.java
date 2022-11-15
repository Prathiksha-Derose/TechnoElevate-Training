package com.te.javabasics.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//import java.util.Set;

public class StudentTest {
	static Scanner sc=new Scanner(System.in);
	static int a;
	int b;
	
	
     public void m1() {
    	 ArrayList<Student> arraylist = new ArrayList<Student>();
    	 
     System.out.println("Enter your Choice for Sorting");
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
    		 m1();
    	 }
    	 else
    	 {
    		 System.out.println("You have not selected Yes or Y");
    	 }
	}while(b==1);
}
}
   
     


	



