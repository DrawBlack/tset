package com.fengshan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AdingGroup {
	public static void main(String [] args){
		Collection<Integer> collection =new ArrayList<Integer>(Arrays.asList(1,2,3,4)); 
		Integer [] moreInts={5,6,7,8};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection,3,4,5,6,7);
		Collections.addAll(collection, moreInts);
		List<Integer> list =Arrays.asList(3,4,5,6,7);
		list.set(1, 99);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		for (Integer integer : collection) {
			System.out.println(integer);
		}
		
			
	}
}
