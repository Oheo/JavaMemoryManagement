package com.greedy.leetCode;

/*	11. Container With Most Water 
		https://leetcode.com/problems/container-with-most-water/
		
      We can calculate the area using the formula,
		   Area = minimum{height 1, height 2} * width.
		   
	Input: height = [1,8,6,2,5,4,8,3,7]
		   Output: 49
*/

public class ContainerWithMostWater {

	public static void main(String[] args) {

		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int result = 0;

		for (int i = 0; i < height.length-1; i++) {
			for (int j = i + 1; j < height.length; j++) {

				int maxArea = (Math.min(height[i], height[j]) * (j - i));
				result = Math.max(result, maxArea);
			}
		}
		System.out.println(result);
	}

}
