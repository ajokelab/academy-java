package com.bptn.course._linkedhashmap;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        Map<String, Integer> studentAges = new LinkedHashMap<>();

        // Add elements to the LinkedHashMap
        studentAges.put("Akin", 20);
        studentAges.put("Sanmi", 22);
        studentAges.put("Ajoke", 18);

        // Retrieve an element from the LinkedHashMap
        System.out.println("Ajoke's age is: " + studentAges.get("Ajoke"));

        // Update an element in the LinkedHashMap
        studentAges.put("Ajoke", 25);
        System.out.println("Ajoke's updated age is: " + studentAges.get("Ajoke"));

        // Remove an element from the LinkedHashMap
        studentAges.remove("Ajoke");
        System.out.println("Is Ajoke in the LinkedHashMap? " + studentAges.containsKey("Ajoke"));

        // Print the keys in the order they were inserted
        System.out.println("Keys in insertion order: " + studentAges.keySet());
    }
}
