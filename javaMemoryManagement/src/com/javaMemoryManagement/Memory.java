package com.javaMemoryManagement;

public class Memory {

	public static void main(String[] args) {
		int localValue =5;
		//int returnedValue=calculate(localValue);
		calculate(localValue);
		System.out.println("LocalValue = "  +localValue);
		//System.out.println("returnedValue = "  +returnedValue);
	}
	
	public static void calculate(int calcValue) {
		System.out.println("reference to localvalue = "  +calcValue);
		calcValue =calcValue *100;
		//System.out.println("calcValue = "  +calcValue);	
		//return calcValue;
	}

}
