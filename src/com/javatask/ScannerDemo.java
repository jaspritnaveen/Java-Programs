package com.javatask;
import java.util.*;
public class ScannerDemo {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				//String 
				System.out.println("Enter Your Name:");
				String name = sc.nextLine();
				
				//Char 
				System.out.println("Enter Your Initial:");
				char initial  = sc.next().charAt(0);
				
				//Boolean
				System.out.println("Do you have Siblings:");
				boolean siblings = sc.nextBoolean();
				
				//byte 
				System.out.println("Enter Your Age:");
				Byte age = sc.nextByte();
				
				//Short  
				System.out.println("Enter Your EmployeeID:");
				Short empid  = sc.nextShort();
				
				//int  
				System.out.println("Enter Your PinCode:");
				int pincode = sc.nextInt();
				
				//Double
				System.out.println("Enter Your Salary:");
				Double salary = sc.nextDouble();
				
				//Long 
				System.out.println("Enter Your Mobile Number:");
				Long mnumber = sc.nextLong();
				
				System.out.println("**********************");
				System.out.println("Name: "+name);
				System.out.println("Initial: "+initial);
				System.out.println("Siblings: "+siblings);
				System.out.println("Age: "+age);
				System.out.println("Empid: "+empid);
				System.out.println("pincode: "+pincode);
				System.out.println("Salary: "+salary);
				System.out.println("Mobile Number: "+mnumber);
				System.out.println("**********************");
				
				sc.close();
	}
}

//System.out.println();
