package com.test.logical;

public class B {
	
public static void main(String args[]){
	System.out.println("Hello");

char ch[]={'H','A','R','E','S','H'};
String st=" ";
int i;
for( i=ch.length-1;i>=0;i--){
	System.out.println(i+"\t"+ch[i]);
/*String st1=new String(ch);
String st2=String.valueOf(ch);
System.out.println(st2);*/

	char ch1=ch[i];
	st+=ch1;

}
System.out.print(st);
}}

