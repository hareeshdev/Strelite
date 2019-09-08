package com.test.logical;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab444 {
	public static void main(String args[]){
		try{
	//== compare the two primitive type variables & it will compare the two reference type address variable

	List list=new ArrayList();
	list.add("Harish");
	list.add("Kumar");
	list.add("mohan");
	List arr=new ArrayList();
	list.add("add");
	list.add("sub");
	list.add("multi");
	list.addAll(arr);
ListIterator it=list.listIterator();
System.out.println(list);
while(it.hasPrevious()){
int indx=it.nextIndex();
	Object obj=it.previous();
	System.out.println(indx+"\t"+obj);
}


		}catch(Exception e){
			e.printStackTrace();
		}	
	
}
}
 class Student{
	int sid;
	String sname;
	public Student(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
	public int hashcod(){
		
		return(int)sid;
	}
	public String toString(){
		return +sid+"\t"+sname;
	}
	public boolean equals(Object obj){
		Student st=(Student)obj;
		return this.sid==st.sid && this.sname.equals(st.sname);
	}
 }	
 