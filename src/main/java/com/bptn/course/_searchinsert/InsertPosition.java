package com.bptn.course._searchinsert;

public class InsertPosition {

	public static int searchInsert(int[] nums, int target) {
	
		        // Initialize the left and right pointers
		        int left = 0;
		        int right = nums.length - 1;

		        // Perform binary search
		        while (left <= right) {
		            int mid = left + (right - left) / 2;

		            if (nums[mid] == target) {
		                return mid;
		            } else if (nums[mid] < target) {
		                left = mid + 1;
		            } else {
		                right = mid - 1;
		            }
		        }

		        // Return the insertion point
		        return left;
		    }

		    public static void main(String args[]){
		        int nums[] = {1, 3, 5, 7, 9}, target = 9;
		        int nums1[] = {1, 3, 5, 6}, target1 = 3;
		        int nums2[] = {1, 3, 5, 6, 7}, target2 = 7;

		        System.out.println(searchInsert(nums, target));  // Output: 4
		        System.out.println(searchInsert(nums1, target1));  // Output: 1
		        System.out.println(searchInsert(nums2, target2));  // Output: 4
		    }
		}