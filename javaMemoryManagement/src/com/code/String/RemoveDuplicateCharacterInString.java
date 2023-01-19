package com.code.String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {

		String s = "programming";

		// 1) Using Java8
		// 2) Using Index.of()
		// 3) Using Character Array
		// 4) Using Set Interface method

		// Approach 1

		StringBuilder sb1 = new StringBuilder();
		s.chars().distinct().forEach(c -> sb1.append((char) c));
		System.out.println(sb1);

		// Approach 2
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int index = s.indexOf(c, i + 1);
			if (index == -1) {
				sb2.append(c);
			}
		}
		System.out.println(sb2);

		// Approach 3

		StringBuilder sb3 = new StringBuilder();
		char[] array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				sb3.append(array[i]);
			}
		}
		System.out.println(sb3);
		
		// Approach 4		
		Set set = new LinkedHashSet();
	}

}
