package com.javaMemoryManagement;

public class PassingValueMain {

	public static void main(String[] args) {
		Customer c = new Customer("Sally");
        renameCustomer(c);
        System.out.println(c.getName());
	}

	private static void renameCustomer(Customer cust) {
		cust.setName("Diane");
		
	}

}
