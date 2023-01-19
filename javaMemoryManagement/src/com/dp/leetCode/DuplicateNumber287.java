package com.dp.leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class DuplicateNumber287 {
//https://leetcode.com/problems/find-the-duplicate-number/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 4, 2, 2 };
		int result = singleNumber(nums);
		System.out.println(result);

	}

	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			hashmap.put(nums[i], i);
		}

		for (int i : hashmap.keySet()) {
			if (hashmap.get(i) == 1) {
				return i;
			}
		}
		return -1;
	}

}
