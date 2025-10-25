package com.task;
import java.util.Scanner;
public class Fibonacci {
	
	public void FindFibonacci(int num) { 
		int first = 0;
		int second = 1;
		
		if (num <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
		
		if(num==1) {
			System.out.print(first);
			return;
		}
		
        System.out.print(first + " " + second + " ");

        
		for(int i=2;i<num;i++) {
			int nextTerm = first + second;
			System.out.print(nextTerm+" ");
			first = second;
			second = nextTerm;	
		}
	}

	public static void main(String[] args) {
		Fibonacci obj = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		obj.FindFibonacci(num);
	}
}
