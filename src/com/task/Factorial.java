package com.task;

import java.util.Scanner;

public class Factorial {

	
	public int FactorialOfNumber(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args) {
		
		Factorial obj = new Factorial();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		System.out.println("Factorial of "+num +" is : " +obj.FactorialOfNumber(num));
		
	}

}
