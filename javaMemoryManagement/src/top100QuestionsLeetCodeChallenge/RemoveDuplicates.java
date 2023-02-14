package top100QuestionsLeetCodeChallenge;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//26. Remove Duplicates from Sorted Array

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Explanation : https://www.youtube.com/watch?v=JHzdGAh_6mk

		int[] nums1 = {1,1,2};
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
		int output =removeDuplicates(nums);;
		System.out.println("Return k after placing the final result in the first k slots of nums "+output);		

	}
	
	// Two Pointer Approach
	
	public static int removeDuplicates(int[] nums) {
        int j=0; 
        for(int i=0;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                nums[++j]=nums[i];
            }
        }
        return j+1;     
    }
}