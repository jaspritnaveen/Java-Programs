package com.constructor;

public class Constructor {

	
	public Constructor() {
		System.out.println("This is from Constructor");
	}
	
	public Constructor(int a) {
		System.out.println("This is from Constructor with Single Parameter");
	}
	
	
	public static void main(String[] args) {
		Constructor obj1 = new Constructor();
		Constructor obj2 = new Constructor(10);
		 

	}

}
