package com.test.logical;

public class Hash {
	public static void main(String args[]){
		try{
			pen p=new Book();
			System.out.println(p.a);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
abstract  class pen{
	final int a=10;
	static int b;
	int c;
	abstract String getService();
	String getServices(){
		return 		null;
	}
} 
class Book extends pen{
int a=10;
int b;
int c;
Book(){
	System.out.println("DC");
}
Book(int b,int c){
	this.c=c;
	this.b=b;
	
}
	String getService() {
			return "Harish";
	}
	
}