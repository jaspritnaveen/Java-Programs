package com.constructor;

public class SubClass extends SuperClass {

	
	public SubClass(){
		super();
		System.out.println("This Constructor is from SubClass");
	}
	
	public static void main(String[] args) {
//		SuperClass superobj = new SuperClass();
		
		SubClass subobj = new SubClass();
		
		

	}

}
