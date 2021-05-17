package com.greedy.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LabelsSolution {

	public static void main(String[] args) {
		int[] values = { 5, 4, 3, 2, 1 };
		int[] labels = { 1, 1, 2, 2, 3 };
		int num_wanted = 3;
		int use_limit = 1;
		int sum = 0;
		sum=largestValsFromLabels(values,labels,num_wanted,use_limit);
		System.out.println("sum " + sum);
	}

	public static int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {

		int n = values.length;
		int[][] valuesMap = new int[n][2];
		for (int i = 0; i < n; i++) {
			valuesMap[i][0] = values[i];
			valuesMap[i][1] = labels[i];
		}

		Arrays.sort(valuesMap, (a, b) -> b[0] - a[0]);
		Map<Integer, Integer> map = new HashMap();
		int sum = 0;
		int numbers=0;
		for (int i = 0; i < n; i++) {
			int val =valuesMap[i][0];
			int usedTimes =map.getOrDefault(valuesMap[i][1], 0);
			if(usedTimes>=use_limit) {
				continue;				
			}else {
				sum+=val;
				map.put(valuesMap[i][1], usedTimes+1);
				numbers++;
			}
			
			if(numbers>=num_wanted) {
				break;				
			}
		}
		return sum;
	}
}

/*
 * We have a set of items: the i-th item has value values[i] and label
 * labels[i].
 * 
 * Then, we choose a subset S of these items, such that:
 * 
 * |S| <= num_wanted For every label L, the number of items in S with label L is
 * <= use_limit. Return the largest possible sum of the subset S.
 
Example 1:

Input: values = [5,4,3,2,1], labels = [1,1,2,2,3], num_wanted = 3, use_limit = 1
Output: 9
Explanation: The subset chosen is the first, third, and fifth item.

Example 2:

Input: values = [5,4,3,2,1], labels = [1,3,3,3,2], num_wanted = 3, use_limit = 2
Output: 12
Explanation: The subset chosen is the first, second, and third item.

Example 3:

Input: values = [9,8,8,7,6], labels = [0,0,0,1,1], num_wanted = 3, use_limit = 1
Output: 16
Explanation: The subset chosen is the first and fourth item.

Example 4:

Input: values = [9,8,8,7,6], labels = [0,0,0,1,1], num_wanted = 3, use_limit = 2
Output: 24
Explanation: The subset chosen is the first, second, and fourth item.

https://www.youtube.com/watch?v=E0OkE3G95vU
 */
