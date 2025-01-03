package com.bptn.course._areaandperimerimeter;

public class Triangle {

	// Method to calculate the perimeter of the triangle
	public int perimeterCalculator(int a, int b, int c) {
		return a + b + c; // Sum of all sides
	}

	// Method to calculate the area of the triangle
	public int areaCalculator(int b, int h) {
		return (b * h) / 2; // Area formula: (base * height) / 2
	}

	// Do not modify the code below:
	public static void main(String[] args) {

		Triangle object = new Triangle();

		int a = 7;
		int b = 10;
		int c = 35;

		int perimeter = object.perimeterCalculator(a, b, c);
		int area = object.areaCalculator(7, 10);

		System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);
	}
}
