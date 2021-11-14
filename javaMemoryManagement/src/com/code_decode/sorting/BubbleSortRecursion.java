package com.code_decode.sorting;

import java.util.Arrays;

public class BubbleSortRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 80, 32, 45, 12, 30 };
		bubblesort(a, a.length);
		Arrays.stream(a).forEach(element -> System.out.print(element +" "));
		/*
		 * IntStream stream = Arrays.stream(a);
		 * 
		 * // Displaying elements in Stream stream.forEach(str -> System.out.print(str +
		 * " "));
		 */
	}

	private static void bubblesort(int[] a, int length) {
		if (length == 1) {
			return;
		}
		for (int j = 0; j < length - 1; j++) {
			if (a[j] > a[j + 1]) {
				int temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
		bubblesort(a, length - 1);
	}
}
