package com.bptn.course._accessmodifiersdemo;

public class Main { // This line defines a public class named Main

	public static void main(String[] args) { // This line defines the main method, which is the entry point of the
												// program.

		AccessModifiersSubclass subclass = new AccessModifiersSubclass(); // This line creates an object named subclass
																			// of type AccessModifiersSubclass.

		subclass.accessFieldsAndMethods(); // This line calls the accessFieldsAndMethods method on the subclass object.
	}
}