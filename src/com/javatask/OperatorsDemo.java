package com.javatask;
import java.util.Scanner;
public class OperatorsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));

        System.out.println("Relational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));

        System.out.println("Logical Operators:");
        System.out.println("(a > 5 && b > 5): " + (a > 5 && b > 5));
        System.out.println("(a > 5 || b < 5): " + (a > 5 || b < 5));
        
        
        System.out.println("Bitwise Operators:");
        System.out.println("(a > 5 & b > 5): " + (a > 5 & b > 5));
        System.out.println("(a > 5 | b < 5): " + (a > 5 | b < 5));
        
        
        System.out.println("Increment & Decrement Operators:");
        System.out.println("++a : " + (++a)); 
        System.out.println("--b : " + (--b));
        System.out.println("a++ : " + (a++)); 
        System.out.println("b-- : " + (b--)); 
      
        System.out.println("Ternary Operator:");
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println("Result: " + result);

        sc.close();
    }
}
