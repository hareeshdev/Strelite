package com.test.logical;

public class Hello {
	private A aobj;
	private B bobj;
	public Hello() {
		System.out.println("Hello-DC");
	}
	public void setAobj(A aobj) {
		this.aobj = aobj;
	}
	public Hello(B bobj) {
		super();
		this.bobj = bobj;
	}
	
}
