package com.bptn.course._wordencryption;

		
		import java.util.Scanner;

		public class WordEncryption {
			
		    public static void main(String[] args) {
		    	
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter a word
		        System.out.print("Enter a word to encrypt: ");
		        String word = scanner.nextLine();

		        // Encrypt the word
		        String encryptedWord = encryptWord(word);

		        // Display the encrypted word
		        System.out.println("Encrypted word: " + encryptedWord);

		        scanner.close();
		    }

		    // Method to encrypt the word by shifting each letter by one position
		    public static String encryptWord(String word) {
		        StringBuilder encrypted = new StringBuilder();

		        // Iterate through each character of the input word
		        for (char c : word.toCharArray()) {
		            // Check if the character is a lowercase letter
		            if (c >= 'a' && c <= 'z') {
		                // Shift the character by one position, wrapping around from 'z' to 'a'
		                encrypted.append((char) ((c - 'a' + 1) % 26 + 'a'));
		            }
		            // Check if the character is an uppercase letter
		            else if (c >= 'A' && c <= 'Z') {
		                // Shift the character by one position, wrapping around from 'Z' to 'A'
		                encrypted.append((char) ((c - 'A' + 1) % 26 + 'A'));
		            }
		            // If the character is non-alphabetic, leave it unchanged
		            else {
		                encrypted.append(c);
		            }
		        }

		        return encrypted.toString();
		    }
		    
	
		}
		






