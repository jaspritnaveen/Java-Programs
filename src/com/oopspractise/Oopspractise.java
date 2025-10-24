package com.oopspractise;
import java.util.*;

public class Oopspractise {

	
	
	public int Addition(int a,int b) {
		int sum = a + b;
		return sum;
	}
	
	
	
	public String ReverseNumUsingString(int num) {
		String str = num + "";
		String newStr = "";
		for(int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			newStr =  newStr + ch;
		}
		
		return newStr;
	}
	
	public int ReverseNum(int num) {
		
		int temp = num;
		int res = 0;
		
		while(temp!=0) {
			int dig = temp % 10;
			res = res * 10 + dig;
			temp = temp / 10;
		}
		
		return res;
		
	}
	
	private String ReverseWord(String str) {
		
		String reverse = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			reverse = reverse + ch;
		}
		
		return reverse;
	}
	
	public String ReverseEachWord(String strings) {
	    String[] strArr = strings.split(" ");
	    String result = "";

	    for (String str : strArr) {
	        String reverse = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reverse = reverse + str.charAt(i);
	        }
	        result = result + reverse + " ";
	    }

	    return result.trim();  
	}

	
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num1:");
	int num1 = sc.nextInt();
	System.out.println("Enter num2:");
	int num2 = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter String:");
	String str = sc.nextLine();
	
	
	Oopspractise obj = new Oopspractise();
	int sum = obj.Addition(num1, num2);
	
	System.out.println("Sum of Numbers: "+sum);
	
	
	String strnum = obj.ReverseNumUsingString(num2);
	System.out.println("Reverse Num using String: "+strnum);
	
	int reverse = obj.ReverseNum(num2);
	System.out.println("Reverse Num Using While: " +reverse);
	
	
	
	String ReverseWord = obj.ReverseWord(str);
	System.out.println("Revered Word: "+ReverseWord);
	
	
	String ReverseEachWord = obj.ReverseEachWord(str);
	System.out.println("Revered Each Word: "+ReverseEachWord);
	
	
	
	
	sc.close();

	}

}
