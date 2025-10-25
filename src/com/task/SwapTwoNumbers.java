package com.task;
import java.util.*;


public class SwapTwoNumbers {

	
	public void Swap(int a,int b) {
		a = a-b;
		b = a+b;
		a = b-a;
		
		System.out.println("After Swapping");
		System.out.println("first Number: "+a);
		System.out.println("second Number: "+b);
		
		 
	}
	
	public static void main(String[] args) {
		SwapTwoNumbers obj = new SwapTwoNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second Number: ");
		int num2 = sc.nextInt();
		
		
		obj.Swap(num1,num2);

	}

}
