package top100QuestionsLeetCodeChallenge;

import java.util.Arrays;
import java.util.Comparator;

/*Given a list of non-negative integers nums, 
 * Arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

Example 1:

Input: num1 = [10,2]
Output: "210"

Example 2:

Input: num2 = [3,30,34,5,9]
Output: "9534330"


*/

public class LargestNumberLeetCode179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,30,34,5,9};
		String largestnumber = largestNumber(nums);
		System.out.println(" Largest Number "+largestnumber);

	}
	
	public static String largestNumber(int[] nums) {

		if (nums.length == 0)
			return "";
		//Step 1 : new String array created and values inserted in string
		String sa[] = new String[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			sa[i] = Integer.toString(nums[i]);
		}
		
		
		//Step 2 
		String largestnumber ="";
		Arrays.sort(sa, new Comparator<String>() {
			public int compare(String s1,String s2) {
				return (s2+s1).compareTo((s1+s2));
			}		
		});
		
		for(String string :sa) {
			largestnumber+=string;			
		}
		return largestnumber;
	}

}
