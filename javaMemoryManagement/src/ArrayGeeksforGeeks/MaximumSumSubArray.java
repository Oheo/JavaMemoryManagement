package ArrayGeeksforGeeks;

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class MaximumSumSubArray{
	public static void main(String args[]) {
	    // Your code goes here
	    //int a[] = {1, 3, 8, -2, 6, -8, 5};
	    //int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
	    int []a = {1,2,3,-2,5};
	    int s=7;
	    ForLoopSolution obj=new ForLoopSolution();
	    System.out.println(obj.maximumSubArraySum(a));
	    System.out.println(obj.KadanceAlgo(a));
	}
}


//} Driver Code Ends
//Simple 2 For Loop Solution
class ForLoopSolution
{
	// Function to find a continuous sub-array which adds up to a given number.
	static int maximumSubArraySum(int[] arr) {
		int size = arr.length;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < size; i++) {
			int currentMax = 0;
			for (int j = i; j < size; j++) {
				currentMax = currentMax + arr[j];
				if (currentMax > maxSum) {
					maxSum = currentMax;
				}
			}
		}
		return maxSum;
	}
	
	static int KadanceAlgo(int[] arr) {
		int size = arr.length;
		int maxSum = Integer.MIN_VALUE;
		int currentMax = 0;
		for (int j = 0; j < size; j++) {
			currentMax = currentMax + arr[j];
			if (currentMax > maxSum) {
				maxSum = currentMax;
			}
			if (currentMax < 0) {
				currentMax = 0;
			}
		}
		return maxSum;
	}
}