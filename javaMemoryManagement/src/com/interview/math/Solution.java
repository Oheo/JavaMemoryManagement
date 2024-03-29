package com.interview.math;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Solution {
	
	public ArrayList<Integer> allFactors(int a) {
	    ArrayList<Integer> resh=new ArrayList<>();
	    LinkedList<Integer> rest=new LinkedList<>();
	    int f=1;
	    while (f<=Math.sqrt(a)) {
	        if (a % f == 0) {
	            resh.add(f);
	            if (a/f!=f) {
	                rest.addFirst(a/f);
	            }
	        }
	        f++;
	    }
	    resh.addAll(rest);
	    return resh;
	    
	    //PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	}
}
