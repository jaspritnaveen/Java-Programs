package com.polymorphism;

public class MethodOverLoading {

	public void Addition(int a, int b) {
		int sum = a + b;
		System.out.println("Double Parameter: "+sum);
	}
	
	public void Addition(int a) {
		int sum = a;
		System.out.println("Int Single Parameter: "+sum);
	}
	
	public void Addition(float a) {
		float sum = a;
		System.out.println("Float Single Parameter: "+sum);
	}
	
	
	public void Addition() {
		 
		System.out.println("No paramaetrs: ");
	}
	
	
	
	public static void main(String[] args) {
		
				
		MethodOverLoading mo = new MethodOverLoading();
		mo.Addition();
		mo.Addition(10,15);
		mo.Addition(100);
		mo.Addition(100.5f);
		
	}

}
