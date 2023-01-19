package study.G75.Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target. You may assume that each input
 * would have exactly one solution, and you may not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
 * nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * @author I328930
 *
 */

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,7,11,15};
		int target = 9;	
		twoSum(nums,target);

	}
	
	 public static int[] twoSum(int[] nums, int target) {
		 HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		 int result[] = new int[2];	
			for(int i=0;i<nums.length;i++) {
				if(map.containsKey(target-nums[i])) {
					result[0]=nums[i];
					result[1]=i;				
				}else {
					map.put(i, nums[i]);
				}
			}
			System.out.println(result[0]);
			System.out.println(result[1]);
			return result;  
			
	    }

}
