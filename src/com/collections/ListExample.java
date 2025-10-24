package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1,2,3,4,5,7,8,9,7);
		
		System.out.println(list);
		
		
		
		Integer[] intArray = list.toArray(new Integer[0]);
		
        System.out.println("Array: " + Arrays.toString(intArray));

        
       
        
        
        
		
	}

}
