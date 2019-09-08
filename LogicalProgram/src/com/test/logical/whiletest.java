package com.test.logical;

public class whiletest {
	public static void main(String[] args) {
int i=1;
char ch='A';
String st="";
while(i<=10){
	System.out.println(i+"\t"+ch++);
i++;
st+=ch++;
/* if(st.equals("pwc")){
	System.out.println(st);
}
*/

}
if(st.equals("D"))
System.out.print(st+"\t"+i);
else
	System.out.println("not String "+st);
	
	}
}