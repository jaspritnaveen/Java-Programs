package com.task;

import java.util.Scanner;

public class Palindrome {
		
	public int ReverseNumber(int num) {
			
		 
		int result = 0;
		
		while(num!=0) {
			int lastdigit = num%10;
			result = result * 10 + lastdigit;
			num = num / 10;
		}
		
		return result;
	}
	
	
	public void CheckPalindrome(int original,int reversed) {
		if(original==reversed) {
			System.out.println("The number is Palindrome");
		}
		else {
			System.out.println("The number is not a Palindrome");
		}
	}
	
	public static void main(String[] args) {
		
		Palindrome obj = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		
		int reversedNumber = obj.ReverseNumber(num);
		System.out.println("Reversed Number: "+reversedNumber);
		
		
		obj.CheckPalindrome(num, reversedNumber);
	}

}
