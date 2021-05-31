package com.javaMemoryManagement;

public class InternalizedStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String one = "Hello";
		String two = "Hello";

		if (one == two) {
			System.out.println("They are the same object");
		} else {
			System.out.println("They are the different object");
		}
	}

}
