package com.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collections_Example {

	public List<Integer> Linkedlist(int arr[]){
		
		
		List <Integer> linkedlist = new LinkedList<>();
		for(int ele:arr) {
			linkedlist.add(ele);
		}
		
		return linkedlist;
	}
	
	
	public List<Integer> AddAllExample(List<Integer> LL) {
		List <Integer> copyLL = new LinkedList<>();
		 
			copyLL.addAll(LL);
		
		
		return copyLL;
	}
	
	
	public static void main(String[] args) {
		
		
		Collections_Example obj = new Collections_Example();
		
		int arr[] = {0,0,1,2,3,4,5,6,7,8,9,9};
		
		List <Integer> LL = obj.Linkedlist(arr);
		
		System.out.println(LL);
		
		
		
		 List<Integer> copyLL = obj.AddAllExample(LL);
	     System.out.println("Copied List: " + copyLL);
	     
	     
	     Collections.reverse(copyLL);
	     System.out.println("Copied Reverse List: " + copyLL);
	     
	     
	     Collections.shuffle(copyLL);
	     System.out.println("Copied Shuffled List: " + copyLL);
	     
	     
	     
	     for(int ele:LL) {
	    	 System.out.println("Frequency of"+" "+ele +": "+Collections.frequency(LL, ele));
	     }
	     
 
	     
	     
	     
	     
		
	}

}
