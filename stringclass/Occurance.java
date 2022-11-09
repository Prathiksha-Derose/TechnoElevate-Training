package com.te.javabasics.stringclass;

public class Occurance {

	public static void main(String[] args){
		// To Count occurrence//
		String str = "abracadabra-banana";
		System.out.println(str);
	    int count = str.length() - str.replace("a", "").length();
		System.out.println("occurrence of a: "+count);
		
		
		//*******************//
		String str1= "abracadabra-banana";
		System.out.println(str1);
		// count occurrence 
		long count1 = str1.chars().filter(ch -> ch == 'a').count();
		System.out.println("occurrence of a: "+count1);
		
		//******************//
		String str2 = "abracadabra-banana";
		System.out.println(str2);
		// count occurrence 
		int count2 = 0;
	    for (int i=0; i < str2.length(); i++)
	    {
	        if (str2.charAt(i) == 'a')
	        {
	             count2++;
	        }
	    }
		System.out.println("occurrence of a: "+count2);
		}
}
