package com.bptn.course._calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("/...Start Using Calculator.../");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Addition
                    System.out.print("Enter the first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is = " + (num1 + num2));
                    break;
                case 2:
                    // Subtraction
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("The difference of the numbers " + num1 + " and " + num2 + " is = " + (num1 - num2));
                    break;
                case 3:
                    // Multiplication
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + (num1 * num2));
                    break;
                case 4:
                    // Division
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Dividing " + num1 + " by " + num2 + " the quotient is " + (num1 / num2));
                        System.out.println("The remainder is " + (num1 % num2));
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    // Square
                    System.out.print("Enter the number to find Square: ");
                    num1 = scanner.nextDouble();
                    System.out.println("The Square of the number " + num1 + " is = " + (num1 * num1));
                    break;
                case 6:
                    // Square Root
                    System.out.print("Enter the number to find Square Root: ");
                    num1 = scanner.nextDouble();
                    System.out.println("The Square Root of the number " + num1 + " is = " + Math.sqrt(num1));
                    break;
                case 7:
                    // Reciprocal
                    System.out.print("Enter the number to find Reciprocal: ");
                    num1 = scanner.nextDouble();
                    if (num1 != 0) {
                        System.out.println("The Reciprocal of the number " + num1 + " is = " + (1 / num1));
                    } else {
                        System.out.println("Reciprocal of zero is not defined.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Choose something more valid!.");
                    break;
            }

            System.out.print("To continue calculation Press 2, else press any other number to exit: ");
            choice = scanner.nextInt();
        } while (choice == 2);

        scanner.close();
    }



	}


