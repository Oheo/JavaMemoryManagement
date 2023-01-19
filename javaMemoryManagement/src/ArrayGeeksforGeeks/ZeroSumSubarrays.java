package ArrayGeeksforGeeks;

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here 
 * You are given an array arr[] of size n. Find the total 
 * count of sub-arrays having their sum equal to 0.
 * 
 * */

import java.io.*;
import java.util.*;

class ZeroSumSubarrays {
	public static void main(String[] args) {
		long arr[] = { 0, 0, 5, 5, 0, 0 };
		int n = 6;
		Solution ob = new Solution();
		System.out.println(ob.findSubarray(arr, n));

	}
}
//} Driver Code Ends
//User function Template for Java
class Solution {
	// Function to count subarrays with sum equal to 0.
	public static long findSubarray(long[] arr, int n) {
		// Your code here
		int a[] = { 0, 0, 5, 5, 0, 0 };
		int sum = 0;
		long count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] + arr[j] == sum) {
					count++;
				}
			}
		}
		return count;
	}
}