package com.bptn.course._palindrone;


		import java.util.Scanner;

		public class PalindromeChecker {
			
		    public static void main(String[] args) {
		    	
		    	Scanner scanner = new Scanner(System.in);
		    	
		        System.out.println("Enter the string to check for palindrome: ");
		        
		        String input = scanner.nextLine();
		        String reverseInput = "";

		        for (int i = input.length() - 1; i >= 0; i--) {
		            reverseInput += input.charAt(i);
		        }

		        if (input.toLowerCase().equals(reverseInput.toLowerCase())) {
		            System.out.println("Input string is palindrome");
		        } else {
		            System.out.println("Input string is not palindrome");
		            
		            scanner.close();
		        }
		    }
		}

	


