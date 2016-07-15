package com.stringdemo;

public class Immutable {
	public static void upcase(String s){
		 s.toUpperCase();
	}
	
	public static void name(Person p){
		p.name =10;
	}
	
	public static void main(String [] srgs){
		String str="abc";
		//String newstr=upcase(str);
		System.out.println(str);
		//System.out.println(newstr);
		String str2="abc";
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		Person p1=new Person(1);
		Person p2=new Person (1);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		String s1=new String("hello world");
		String s2=new String("hello world");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		//String s3=upcase(s2);
		//System.out.println(s3);
		System.out.println(s1);
		upcase(s1);
		System.out.println(s1);
		
		System.out.println(p1.name);
		name(p1);
		System.out.println(p1.name);
	}
}

class Person{
	int name;
	public Person(int name){
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p=(Person)obj;
		if(this==p){
			return true;
		}else if(p.name==this.name)
			return true;
		return false;
	}
	
}
