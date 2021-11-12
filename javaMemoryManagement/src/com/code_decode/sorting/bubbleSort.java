package com.code_decode.sorting;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {80,32,45,12,30};
		bubblesort(a);

	}

	public static void bubblesort(int[] a) {
		for (int j = 0; j < a.length - 1; j++) {
			for (int k = 0; k < a.length - 1-j; k++) {
				if (a[k] > a[k + 1]) {
					// write code to swap
					int temp=a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");		
		}
	}

}
