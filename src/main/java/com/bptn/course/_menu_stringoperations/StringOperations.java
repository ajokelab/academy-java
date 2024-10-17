package com.bptn.course._menu_stringoperations;

		
		import java.util.Scanner;

		class StringOperations {
		    public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        int choice;

		        do {
		            // Display menu
		            System.out.println("/...String Menu.../");
		            System.out.println("Press 1 for Palindrome Check");
		            System.out.println("Press 2 to reverse a String");
		            System.out.println("Press 3 to Concatenate two Strings");
		            System.out.println("Press 4 for String Comparison");
		            System.out.println("Press 5 to Calculate the Length of String");
		            System.out.print("Enter your option: ");
		            choice = scanner.nextInt();
		            scanner.nextLine(); // Consume newline

		            switch (choice) {
		                case 1:
		                    // Palindrome Check
		                    System.out.println("Palindrome Check");
		                    System.out.print("Enter a string: ");
		                    String str = scanner.nextLine();
		                    if (isPalindrome(str)) {
		                        System.out.println(str + " is a palindrome");
		                    } else {
		                        System.out.println(str + " is not a palindrome");
		                    }
		                    break;
		                case 2:
		                    // Reverse a String
		                    System.out.println("Reverse a String");
		                    System.out.print("Enter a string: ");
		                    str = scanner.nextLine();
		                    System.out.println("Reversed string: " + reverseString(str));
		                    break;
		                case 3:
		                    // Concatenate two Strings
		                    System.out.println("Concatenate two Strings");
		                    System.out.print("Enter the first string: ");
		                    String str1 = scanner.nextLine();
		                    System.out.print("Enter the second string: ");
		                    String str2 = scanner.nextLine();
		                    System.out.println("Concatenated string: " + str1 + str2);
		                    break;
		                case 4:
		                    // String Comparison
		                    System.out.println("String Comparison");
		                    System.out.print("Enter the first string: ");
		                    str1 = scanner.nextLine();
		                    System.out.print("Enter the second string: ");
		                    str2 = scanner.nextLine();
		                    if (str1.equals(str2)) {
		                        System.out.println("The entered strings are equal");
		                    } else {
		                        System.out.println("The entered strings are not equal");
		                    }
		                    break;
		                case 5:
		                    // Calculate the Length of String
		                    System.out.println("Length of a string");
		                    System.out.print("Enter a string: ");
		                    str = scanner.nextLine();
		                    System.out.println("The length of the entered string is: " + str.length());
		                    break;
		                default:
		                    // Invalid choice
		                    System.out.println("Invalid choice! Please make a valid choice.");
		                    break;
		            }

		            // Ask user if they want to continue
		            System.out.print("To continue calculation Press 1, else press any other number to exit: ");
		            choice = scanner.nextInt();
		        } while (choice == 1);

		        scanner.close();
		    }

		    // Method to check if a string is a palindrome
		    public static boolean isPalindrome(String str) {
		        int left = 0, right = str.length() - 1;
		        while (left < right) {
		            if (str.charAt(left) != str.charAt(right)) {
		                return false;
		            }
		            left++;
		            right--;
		        }
		        return true;
		    }

		    // Method to reverse a string
		    public static String reverseString(String str) {
		        StringBuilder reversed = new StringBuilder(str);
		        return reversed.reverse().toString();
		    }
	

	}

