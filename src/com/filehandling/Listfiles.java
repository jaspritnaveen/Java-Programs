package com.filehandling;

import java.io.File;

public class Listfiles {

	public static void main(String[] args) {
	
		
		File directory = new File("C:/Users/jaspr/Downloads/Text");
		
		File[] files = directory.listFiles();
		
		for (File f : files) {
		    System.out.println(f.length());  
		}

		

		 

	}

}
