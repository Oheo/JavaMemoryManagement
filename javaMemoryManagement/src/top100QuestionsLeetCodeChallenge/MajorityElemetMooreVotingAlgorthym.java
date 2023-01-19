package top100QuestionsLeetCodeChallenge;

import com.dp.leetCode.MajorityElement;

public class MajorityElemetMooreVotingAlgorthym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = {3,2,3};
		int[] nums = {2,2,1,1,1,2,2};
		int[] nums3 = {6,5,5};
		
		int output =majorityElement(nums1);
		int output1=majorityElement1(nums1);
		System.out.println("Majority Element is "+output);	
		System.out.println("Majority Element is "+output1);	

	}
	
	public static int majorityElement(int[] nums) {
		int majorityELement = 0;
		int freq = 0;

		for (int num : nums) {
				if (freq == 0) {
					majorityELement = num;
				}
				if (num == majorityELement) {
					freq++;
				} else {
					freq--;
				}
		}
		return majorityELement;
	}
	
	public static int majorityElement1(int[] nums) {
		int candidate = 0;
		int count = 0;
		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}
			count = (candidate == num) ? count++ : count--;
		}	
		return candidate;
	}
}