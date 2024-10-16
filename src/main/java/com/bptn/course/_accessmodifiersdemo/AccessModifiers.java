package com.bptn.course._accessmodifiersdemo;

//Define a class with private, public, default, and protected fields and methods
class AccessModifiers {

	private int privateField = 10; // Private field, only accessible within the same class

	public int publicField = 20; // Public field, accessible from anywhere

	int defaultField = 30; // Default field, accessible within the same package

	protected int protectedField = 40; // Protected field, accessible within the same class and subclasses

	private void privateMethod() { // Private method, only accessible within the same class
		System.out.println("Private method called");
	} // Public method, accessible from anywhere

	public void publicMethod() {
		System.out.println("Public method called");

	} // Default method, accessible within the same package

	void defaultMethod() {
		System.out.println("Default method called"); // Protected method, accessible within the same class and
														// subclasses
	}

	protected void protectedMethod() {
		System.out.println("Protected method called");
	}
}
