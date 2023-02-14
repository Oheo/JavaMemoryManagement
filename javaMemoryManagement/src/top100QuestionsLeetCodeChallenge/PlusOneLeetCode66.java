package top100QuestionsLeetCodeChallenge;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//26. Remove Duplicates from Sorted Array

public class PlusOneLeetCode66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Explanation : https://www.youtube.com/watch?v=JHzdGAh_6mk

		int[] digits = { 1, 1, 2 };
		int[] digits1 = { 1, 2, 9 };
		int[] digits2 = { 1, 1, 2 };

		int[] output = plusOne(digits1);
		;
		System.out.println("Output Array " + Arrays.toString(output));

	}

	public static int[] plusOne(int[] digits) {

		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i]++;
				break;
			} else {
				digits[i] = 0;
			}
		}
		if (digits[0] == 0) {
			int[] res = new int[n + 1];
			res[0] = 1;
			return res;
		}

		return digits;
	}
}