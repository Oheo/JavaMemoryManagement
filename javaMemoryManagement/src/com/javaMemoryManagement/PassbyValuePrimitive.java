package com.javaMemoryManagement;


public class PassbyValuePrimitive {

	public static void main(String[] args) {
		int localvalue =5;
		calculate(localvalue);
		System.out.println("localvalue " +localvalue);
	}

	private static void calculate(int calcValue) {
		calcValue = calcValue * 100;
		System.out.println("calcValue " +calcValue);
		
		
	}
}

