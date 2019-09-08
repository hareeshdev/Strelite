package com.test.logical;

public class A {
	private int a;
	private String str;
	
	public A() {
	System.out.println("A-DC");		
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	
public void show(){
	System.out.println(a);
	System.out.println(str);
}
}
