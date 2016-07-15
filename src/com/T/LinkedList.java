package com.T;

public class LinkedList<T> {
	private Node<T> first;			//头结点
	private Node<T> last;			//尾节点
	private int size=0;				//元素个数
	@SuppressWarnings("hiding")
	private class Node<T>{
		T item;
		Node<T> next;
		public Node(T item){
			this.item=item;
		}
	}
	
	public void addFirst(T item){
		Node<T> node=new Node<T>(item);
		if(isEmpty()){
			last=node;
			first=node;
			size++;
			return ;
		}
		node.next=first;
		first=node;
		size++;
	}
	
	public void add(int index , T item){
		if(isEmpty()||index>size||index<0)
			return ;
		Node<T> node=new Node<T>(item);
		Node<T> current=first ;
		Node<T> previous=first;
		int i=0;
		while(i++<index){
			previous=current;
			current=current.next;
		}
		previous.next=node;
		node.next=current;
	}
	
	public void deleteFirst(){
		if(!isEmpty()){
			first=first.next;
			size--;
		}
		
	}
	
	public void add(T item){
		Node<T> node =new Node<T>(item);
		if(isEmpty()){
			first=node;
			last=node;
			size++;
			return ;
		}
		last.next=node;
		last=node;
		size++;
	}
	
	public boolean isEmpty(){
		return (size<=0);
	}
	
	public T remove(T key){
		Node<T> current=first;
		Node<T>	previous=first; 
		if(isEmpty())
			return null;
		
		while(current.item!=key){
			if(current.next==null)
				return null;
			else{
				previous=current;
				current=current.next;
			}
		}
		if(current==previous){
			first=first.next;
			size--;
			return current.item;
		}
		previous.next=current.next;
		size--;
		return current.item;
	}
	
	public T remove(int index){
		Node<T> current=first;
		Node<T> previous=first;
		if(isEmpty()||index>size-1)
			return null;
		if(index==0){
			first=first.next;
			size--;
			return current.item;
		}
		
		int i=0;
		while(i++<index){
			previous=current;
			current=current.next;
		}
		previous.next=current.next;
		size--;
		return current.item;
	}
	
	public void display(){
	    Node<T> current=first;
	    StringBuilder sb=new StringBuilder();
	    sb.append("[");
		while(current!=null){
			sb.append(current.item);
			sb.append(",");
			current=current.next;
		}
		sb.append("]");
		sb.deleteCharAt(sb.length()-2);
		System.out.println(sb.toString());
	    
	}
	
	public int size(){
		return size;
	}
	public static void main(String [] args){
		LinkedList<String> list=new LinkedList<>();
		list.add("w");
		list.add("e");
		list.add("r");
		list.add("t");
		list.add("y");
		list.add("u");
		list.add("i");
		list.display();
		list.addFirst("q");
		list.display();
		list.deleteFirst();
		list.display();
		list.remove("r");
		list.display();
		System.out.println(list.remove(3));
		list.display();
		list.add(2, "a");
		list.display();
		
	}
}
