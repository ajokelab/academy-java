package com.bptn.course._wrapperdemo;

public class IntegerWrapper {

	public Integer value; // Declare a public Integer field to store the value

	public IntegerWrapper(int value) { // Constructor to initialize the value field with an int parameter

		this.value = value; // Assign the int parameter to the value field, autoboxing occurs here

	}

	public static void main(String[] args) { // Declare an int primitive variable

		int primitiveInt = 10; // Create an IntegerWrapper object, passing the int primitive variable to the
								// constructor

		IntegerWrapper wrapper = new IntegerWrapper(primitiveInt); // Autoboxing occurs here, where the int primitive is
																	// converted to an Integer object

		System.out.println("Autoboxing: int to Integer - " + wrapper.value);

		IntegerWrapper wrapper2 = new IntegerWrapper(20); // Create another IntegerWrapper object, passing an int
															// literal to the constructor
															// Declare an int primitive variable and assign it the value
															// of the wrapper2 object

		int unboxedInt = wrapper2.value; // Unboxing occurs here, where the Integer object is converted to an int
											// primitive

		System.out.println("Unboxing: Integer to int - " + unboxedInt);
	}
}