package com.te.javabasics.arrayorder;
import java.util.Scanner;
public class Order {
	public static Scanner sc=new Scanner(System.in);
	public static int choice,quantity=1;
	 public static String again;
	public static double total=0;
	static int order=0;
	static int totalAmount;
	static String[] myorder = {"   ","Briyani","Fried Rice","Momos","Pizza","Burger"};
	static int[] price= {0,100,80,50,99,60};
	public static void menu() {
     for(int x=0;x<5;x++) {
		System.out.println(myorder[x]+"  "+price[x]+"  ");
	}
	}
	public void m1() {
	while(order==0) {
			System.out.println("Select Your Choice:");
			try {
		 int choice=sc.nextInt();
	        if(choice<6) {
			 System.out.println("You have ordered"+"  "+myorder[choice]);
			   System.out.println("Quantity");
			   quantity=sc.nextInt();
			   System.out.println("You have ordered"+" "+quantity+" "+myorder[choice]);
			   totalAmount=((price[choice])*quantity)+totalAmount;
	         System.out.println("Do you want to continue Order");
			 System.out.println("Press Y for Yes & Press N for No");
			 String again=sc.next();
			 if(again.equalsIgnoreCase("Y")) {
				 m1();
			 }
			 else {
				 System.out.println("Payment="+totalAmount);
			 }
			 } else {
				// System.out.println("hiii");
				 throw new InvalidChoiceException("Invalid Choice!!!");
			 }
			
			} 
			catch (InvalidChoiceException e) {
				System.out.println(e.getMessage());
			}
	
	}
	}
	//public static void main(String[] args) {
	//	menu();
	//	m1();
	//}
	}


