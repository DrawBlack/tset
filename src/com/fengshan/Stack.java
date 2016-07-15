package com.fengshan;

import java.util.LinkedList;

public class Stack<T> {
	private LinkedList<T> list =new LinkedList<T>();
	public void push(T v){
		list.addFirst(v);
	}
	public T peek(){
		return list.getFirst();
	}
	
	public T pop(){
		return list.removeFirst();
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public String toString() {
		return list.toString();
	}
	public static void main(String [] args){
		Stack<String> stack =new  Stack<String>();
		for(String str:"My dog has fleas".split(" ")){
			stack.push(str);
		}
		
		System.out.println(stack.toString());
		while(!stack.isEmpty()){
			System.out.print(stack.pop().toString()+" ");
		}
	}
}
