package com.task;

import java.util.Scanner;

public class MinandMax {
	
	public int Largest(int a,int b,int c) {
		int largest;
		if(a>b && a>c) {
			largest = a;
		}
		else if(b>a && b>c) {
			largest = b;
		}
		else {
			largest = c;
		}
		
		return largest;
	}
	
	
	public int  Smallest(int a,int b,int c) {
		int smallest;
		if(a<b && a<c) {
			smallest = a;
		}
		else if(b<a && b<c) {
			smallest = b;
		}
		else {
			smallest = c;
		}
		
		return smallest;
	}
	
	

	public static void main(String[] args) {
		MinandMax obj = new MinandMax();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second Number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter third Number: ");
		int num3 = sc.nextInt();
		
		System.out.println("The Largest number is: "+obj.Largest(num1, num2, num3));
		System.out.println("The Smallest number is: "+obj.Smallest(num1, num2, num3));
		
		
		

	}

}
