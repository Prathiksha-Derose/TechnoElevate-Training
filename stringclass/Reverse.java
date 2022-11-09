package com.te.javabasics.stringclass;

public class Reverse {
	public static void main(String[] args){
		String str = "Studytonight";
		System.out.println(str);
		StringBuilder strb = new StringBuilder(str);
		strb.reverse();
		System.out.println(strb);
		
		
		//*********************//
		String str2 = "Study";
		System.out.println(str2);
		String str3 = "";
		for (int i = str2.length()-1; i>=0; i--) {
			str3 += str2.charAt(i);
		}
		System.out.println(str3);
	}
}
