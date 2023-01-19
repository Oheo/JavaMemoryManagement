package ArrayGeeksforGeeks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KlargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KlargestElementSolution s = new KlargestElementSolution();
		Integer [] nums = {3,2,3,1,2,4,5,5,6}; 
		int k = 2;
		s.findKthLargest(nums, k);
		s.findLthLargestUsingArraySorting(nums,k);
	}
}

class KlargestElementSolution {
    public int findKthLargest(Integer[] nums, int k) {
    	// Heap Question 
    	// MIN Heap and MAX Heap 
    	//PriorityQueue<Integer> pq = new PriorityQueue<Integer>();   //Min Heap
    	PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());   //Max Heap
    	for(int i=0;i<nums.length;i++) {
    		pq.offer(nums[i]);    
    		if(pq.size()>k) {
    			pq.poll();
    		}
    		System.out.println(pq);
    	}
    	 	
    	System.out.println(""+pq.peek());
		return k;
        
    }

	public int findLthLargestUsingArraySorting(Integer[] nums, int k) {
		Arrays.sort(nums,Collections.reverseOrder()); 
		System.out.println(nums);
		int x=0;
		for(int i=0;i<k;i++) {
			x = nums[i];
		}
		return x;		
	}
}

