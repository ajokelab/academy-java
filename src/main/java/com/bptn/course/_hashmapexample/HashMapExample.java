package com.bptn.course._hashmapexample;

import java.util.Map;
import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		// Create a HashMap
		Map<String, Integer> studentAges = new HashMap<>();

		// Add elements to the HashMap
		studentAges.put("Akin", 20);
		studentAges.put("Sanmi", 22);
		studentAges.put("Ajoke", 21);

		// Retrieve an element from the HashMap
		System.out.println("Akin's age is: " + studentAges.get("Akin"));

		// Update an element in the HashMap
		studentAges.put("Akin", 43);
		System.out.println("Akin's updated age is: " + studentAges.get("Akin"));

		// Remove an element from the HashMap
		studentAges.remove("Ajoke");
		System.out.println("Is Ajoke in the HashMap? " + studentAges.containsKey("Ajoke"));
	}
}