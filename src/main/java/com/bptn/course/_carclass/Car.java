package com.bptn.course._carclass;

public class Car {
	
	    String color;
	    String brand; 
	    int price; 
	    
	    // Constructor
	    public Car(String color, String brand, int price) {
	        this.color = color;
	        this.brand = brand;
	        this.price = price;
	    } 
	    
	    // Method to print car details
	    public void printCarDetails() { 
	        System.out.println(color + " " + brand + " " + price); 
	    }
	}

