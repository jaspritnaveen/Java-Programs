package com.polymorphism;

public class ChildPoly extends ParentPoly {
	
	
	 @Override
	 public void Homeproperty() {
		 System.out.println("This is Parent Property Overrided form Child Property");
	 }
	 
	 
	 public void Goldproperty() {
		 System.out.println("This is Child Property");
	 }
	 

	public static void main(String[] args) {
		
		ChildPoly cp = new ChildPoly();
		cp.Goldproperty();
		cp.Homeproperty();
		

	}

}
