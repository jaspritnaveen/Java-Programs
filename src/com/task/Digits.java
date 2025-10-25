package com.task;

import java.util.Scanner;

public class Digits {
	
	public int CountDigits(int num) {
		int count = 0;
		while(num!=0) {
			num = num / 10;
			count++;
		}
		return count;
	}
	
	public int SumOfDigits(int num) {
		int sum = 0;
		while(num!=0) {
			int dig = num % 10;
			sum+=dig;
			num = num / 10;
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Digits obj = new Digits();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		
		System.out.println("The number of digits: "+obj.CountDigits(num));
		System.out.println("The sum of digits: "+obj.SumOfDigits(num));
	}
}
