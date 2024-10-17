package com.bptn.course._mapexamples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
		public static void main(String[] args) {
			
		// Create a HashMap
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Akin", 20);
		hashMap.put("Sanmi", 22);
		hashMap.put("Ajoke", 21);
		System.out.println("HashMap: " + hashMap);

		// Create a TreeMap
		Map<String, Integer> treeMap = new TreeMap<>(hashMap);
		System.out.println("TreeMap: " + treeMap);

///	// Create a LinkedHashMap
	Map<String, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
	System.out.println("LinkedHashMap: " + linkedHashMap);
//
		// Add a new element to the LinkedHashMap
		linkedHashMap.put("Chiamaka", 27);
		System.out.println("LinkedHashMap after adding a new element: " + linkedHashMap);
//
//		// Remove an element from the TreeMap
		treeMap.remove("Akin");
	System.out.println("TreeMap after removing an element: " + treeMap);
//
//		// Update an element in the HashMap
		hashMap.put("Benjamin", 28);
		System.out.println("HashMap after updating an element: " + hashMap);
	}
}
