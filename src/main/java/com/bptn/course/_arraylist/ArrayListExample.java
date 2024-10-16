package com.bptn.course._arraylist;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);

		System.out.println("ArrayList Elements:");

		for (int number : arrayList) {
			System.out.println(number);

			arrayList.set(2, 35);

			arrayList.remove(1);

			System.out.println("Size of ArrayList: " + arrayList.size());

		}

	}
}
