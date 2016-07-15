package com.fengshan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String [] args){
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(1, 2);
		System.out.println(list);
		list.set(1, 3);
		System.out.println(list);
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()){
			Integer i=(Integer) it.next();
			System.out.print(i+"  ");
		}
	}
	
}
