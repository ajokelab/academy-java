package com.bptn.course._hashmapdemo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        // Create a HashMap object
        HashMap<String, Integer> people = new HashMap<>();

        // Use the put() method to add key-value pairs to the map
        people.put("Angie", 33);
        people.put("Steve", 30);
        people.put("John", 32);

        // Use a for loop to print out the key-value pairs in the map
        for (String name : people.keySet()) {
            System.out.println("Name: " + name + ", Age: " + people.get(name));
        }
    }
}
