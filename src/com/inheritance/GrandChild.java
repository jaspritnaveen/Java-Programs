package com.inheritance;

public class GrandChild extends Child {

	
	 public void Landproperty() {
		 System.out.println("This is Grand Child Property");
	 }
	 
	 
	 
	public static void main(String[] args) {
		
		Child gc = new Child();
		gc.Goldproperty();
		gc.Homeproperty();

	}

}
