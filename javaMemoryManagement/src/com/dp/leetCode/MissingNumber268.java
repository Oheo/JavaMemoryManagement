package com.dp.leetCode;

import java.util.Arrays;

public class MissingNumber268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9,6,4,2,3,5,7,0,1}; 
		int missingnumber= missingNumber(a);
		System.out.println(missingnumber);
		System.out.println(Arrays.toString(a));
		
	} 
	
	// 3, 0 , 1 
	

	private static int missingNumber(int[] a) {	 
		int i=0;
		while(i<a.length) {
			if(a[i] <a.length && a[i]!= i) {
				int correctIndex = a[i]; 
				swap(i,correctIndex,a);				
			}else {
				i++;
			}
		}			
		for(int j=0;j<a.length;j++) {
			if(a[j]!=j)	{
				return j;
			}
		}
		return a.length;
	}

	private static void swap(int i, int correctIndex, int[] a) {
		int temp=0;
		temp=a[i];
		a[i]=a[correctIndex];
		a[correctIndex] =temp;
		System.out.println(Arrays.toString(a));
	}
}
