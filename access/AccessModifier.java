package com.te.javabasics.access;

public class AccessModifier {
	public void blue() {
		System.out.println("Blue Colour");
	}
	protected void green() {
		System.out.println("Green Colour");
}
    void pink() {
    	System.out.println("Pink colour");
    }
    private void black() {
    	System.out.println("Black colour");
    }


public static void main(String[] args) {
	AccessModifier accessModifier = new AccessModifier();
	accessModifier.blue();
	accessModifier.green();
	accessModifier.pink();
	accessModifier.black();
}
}