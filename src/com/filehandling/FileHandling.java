package com.filehandling;


import java.io.*;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		
//		BufferedReader bf = new 
//		BufferedReader
//		(new FileReader("C:/Users/jaspr/Downloads/Business.txt"));
//		
//		String line = bf.readLine();
//
//		System.out.println(line);
//		
	
		File file = new File("C:/Users/jaspr/Downloads/Businses.txt");
		
		
	
		try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(file));
            
            writer.write("This text is written from Java Eclipse");
            writer.newLine(); // optional
            writer.write("Second line of text");
            
            writer.close();
            System.out.println("File written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
		 
		Boolean business_exists = file.exists();
		System.out.println(business_exists);
		
		
		
	}

}
