package com.bptn.course._pseudocode;

public class FindOddPosInArray {

	public static void main(String[] args) {
		
		// Create an array and assign values
        int[] numbers = new int[] {10, 20, 30, 40, 50};  

        // Print the elements at odd index positions
        System.out.println("At odd indexes, the elements are: ");  
   
            // Check if the index is odd
        
                
                
                for (int i = numbers.length -2; i >= 1; i -= 2) {
                
                	System.out.print(numbers[i] + " ");
                
            }
        }
    }




