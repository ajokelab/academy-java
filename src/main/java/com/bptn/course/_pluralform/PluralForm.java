package com.bptn.course._pluralform;

import java.util.Scanner;

public class PluralForm {
	
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int amt = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Prompt the user to enter a singular noun
        System.out.print("Enter a singular noun: ");
        String word = scanner.nextLine();

        // Get the plural form of the noun
        String pluralWord = getPluralForm(word, amt);

        // Print the result
        System.out.println(amt + " " + pluralWord);

        scanner.close();
    }

    // Method to get the plural form of a noun based on the given amount
    public static String getPluralForm(String word, int amt) {
        // If the amount is 1, return the word as is
        if (amt == 1) {
            return word;
        }

        // Handle special cases for words ending in "y"
        if (word.endsWith("y") && !word.endsWith("ay") && !word.endsWith("oy") && !word.endsWith("ey") && !word.endsWith("uy")) {
            return word.substring(0, word.length() - 1) + "ies";
        }

        // Handle words ending in "x", "z", "sh", or "ch"
        if (word.endsWith("x") || word.endsWith("z") || word.endsWith("sh") || word.endsWith("ch")) {
            return word + "es";
        }
        
        // Handle special cases for words ending in "fe"
        if (word.endsWith("fe")) {
            return word.substring(0, word.length() - 2) + "ves";
        }
        
     // Handle special cases for words ending in "us"
        if (word.endsWith("us")) {
            return word.substring(0, word.length() - 2) + "i";
        }

        // Default case: add "s" to the end of the word
        return word + "s";
    

	}

}
