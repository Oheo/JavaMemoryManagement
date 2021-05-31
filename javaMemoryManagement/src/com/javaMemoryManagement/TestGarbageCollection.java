package com.javaMemoryManagement;

public class TestGarbageCollection {

	public void finalize() {
		System.out.println("Object is Garbage Collected ");
	}

	public static void main(String[] args) {
		TestGarbageCollection t1 = new TestGarbageCollection();
		TestGarbageCollection t2 = new TestGarbageCollection();
		t1 = null;
		t2 = null;
		System.gc();
	}
}
