package com.dp.leetCode;

import java.util.HashMap;

public class SingleNumber136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,1,2,1,2};
		int result= singleNumber(nums);
		System.out.println(result);
		
	}

	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if (hashmap.containsKey(nums[i])) {
				int count = hashmap.get(i);
				hashmap.put(i, ++count);
			} else {
				hashmap.put(i, 1);
			}
		}

		for (int i : hashmap.keySet()) {
			if (hashmap.get(i) == 1) {
				return i;
			}
		}
		return -1;
	}

}
