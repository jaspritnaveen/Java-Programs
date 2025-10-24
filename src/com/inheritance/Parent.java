package com.inheritance;

public class Parent {

	
	 public void Homeproperty() {
		 System.out.println("This is Parent Property");
	 }
	 
	 
	 
	public static void main(String[] args) {
		Parent p = new Child();         
		Child c = new GrandChild();     
		GrandChild gc = new GrandChild(); 
		
		Child c1 = new Child();  
		

		

	}

}
