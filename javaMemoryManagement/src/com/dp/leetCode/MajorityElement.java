package com.dp.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		Integer[] A = new Integer[] { 2, 1, 2 };
		List<Integer> list = Arrays.asList(A);
		System.out.println(majorityElement(list));
		
		/*
		 * Collections.sort(list); 
		 * return list.get(list.size()/2);
		 */

	}

	public static int majorityElement(final List<Integer> A) {
		Map<Integer, Integer> m = new HashMap<>();
		for (int i : A) {
			m.put(i, m.getOrDefault(i, 0) + 1);
		}
		int max = 0;
		int maxEl = 0;
		for (int i : A) {
			if (m.get(i) > max) {
				max = m.get(i);
				maxEl = i;
			}
		}
		return maxEl;
	}

}
