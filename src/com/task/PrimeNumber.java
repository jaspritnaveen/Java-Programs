package com.task;

import java.util.Scanner;

public class PrimeNumber {

	public boolean isPrime(int num) {
		boolean prime = true;
		
		if(num==0 || num==1) {
			prime = false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				prime = false;
				break;
			}
		}
		
		return prime;
	}
	
	
	public static void main(String[] args) {
		PrimeNumber obj = new PrimeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		
		 if(obj.isPrime(num))
			 System.out.println("The given number is prime");
		 else
			 System.out.println("The given number is not a prime");
	}

}
