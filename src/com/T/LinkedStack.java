package com.T;

public class LinkedStack<T> {
	private Node<T> top;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack<Integer> ls=new LinkedStack<>();
		ls.push(1);
		ls.push(2);
		ls.push(3);
		ls.push(4);
		ls.display();
		ls.pop();
		System.out.println(ls.peek());
		ls.display();
	}
	
	class Node<T>{
		T t;
		Node<T> next;
		public Node(T t){
			this.t=t;
		}
		public Node(){
			this.t=null;
			this.next=null;
		}
		
	}
	
	public void push(T t){
		Node<T> node =new Node<T>(t);
		node.next=top;
		top=node;
	}
	
	public boolean isEmpty(){
		return (top==null); 
	}
	
	public T pop(){
		if(!isEmpty()){
			Node<T> node=top;
			top=top.next;
			return node.t;
		}
		System.out.println("empty stack");	
		return null;
	}
	
	public T peek(){
		return top.t;
	}
	
	public void display(){
		Node<T> node;
		node =top;
		while(!(node==null)){
			System.out.println(node.t);
			node=node.next;
		}
	}
}
