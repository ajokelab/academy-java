package com.bptn.course._treemapexample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		// Create a TreeMap
		Map<String, Integer> studentAges = new TreeMap<>();

		// Add elements to the TreeMap
		studentAges.put("Akin", 20);
		studentAges.put("Sanmi", 22);
		studentAges.put("Ajoke", 21);

		// Retrieve an element from the TreeMap
		System.out.println("Sanmi's age is: " + studentAges.get("Sanmi"));

		// Update an element in the TreeMap
		studentAges.put("Sanmi", 36);
		System.out.println("Sanmi's updated age is: " + studentAges.get("Sanmi"));

		// Remove an element from the TreeMap
		studentAges.remove("Akin");
		System.out.println("Is Akin in the TreeMap? " + studentAges.containsKey("Akin"));

		// Print the keys in sorted order
		System.out.println("Keys in sorted order: " + studentAges.keySet());
	}
}
