package com.oopspractise;

import java.util.HashSet;
import java.util.Set;

//import java.util.*;

public class Arrayjava {

    public int MinNum(int arr[]) {
        int Min = arr[0];
        for (int ele : arr) {
            if (ele < Min) {
                Min = ele;
            }
        }
        return Min;
    }

    public int MaxNum(int arr[]) {
        int Max = arr[0];
        for (int ele : arr) {
            if (ele > Max) {
                Max = ele;
            }
        }
        return Max;
    }

    public int SecMax(int arr[]) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int ele : arr) {
            if (ele > firstMax) {
                secondMax = firstMax;
                firstMax = ele;
            } else if (ele > secondMax && ele != firstMax) {
                secondMax = ele;
            }
        }

        return secondMax;
    }

    public Set<Integer> SetExample(int arr[]) {
    	
    	
    	Set <Integer> uniqueElements = new HashSet<>() ;
    	
    	
    	for(int ele:arr) {
    	uniqueElements.add(ele);
    	
    	}
    	
    	
    	return uniqueElements;
    }
    
    public static void main(String[] args) {
        int arr[] = {895, 1, 2, 3, 4, 456, 5, 6, 7, 8, 9,4,4,4,897,4};

        Arrayjava obj = new Arrayjava();

        int Minimum = obj.MinNum(arr);
        System.out.println("Minimum Number of the Array: " + Minimum);

        int Maximum = obj.MaxNum(arr);
        System.out.println("Maximum Number of the Array: " + Maximum);

        int SMax = obj.SecMax(arr);
        System.out.println("Second Maximum Number of the Array: " + SMax);
        
        
        Set<Integer> SetEx = obj.SetExample(arr);
        System.out.println(SetEx);
        
        
        }
}
