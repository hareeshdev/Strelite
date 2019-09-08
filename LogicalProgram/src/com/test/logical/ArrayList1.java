package com.test.logical;
import java.util.*;
public class ArrayList1 {
public static void main(String args[]){
	ArrayList al=new ArrayList();
al.add("Harish");
al.add("Mohan");
al.add("Babu");
al.add("Kumar");
ListIterator  it1=al.listIterator();
while(it1.hasNext()){
	int indx=it1.nextIndex();
Object obj=it1.next();
System.out.println(indx+"\t"+obj);


}


while(it1.hasPrevious()){
	int indx=it1.previousIndex();
Object obj=it1.previous();
System.out.println(indx+"\t"+obj);


}

System.out.println(al);
}
}
