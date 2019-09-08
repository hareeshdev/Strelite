package com.jlcindia.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Lab12 {
	public static void main(String args[]){
		Connection con=null;
		CallableStatement cs=null;
		ResultSet rs=null;
try{
	con=JDBCUtil.getmysqlConncetion();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Eid");
	int eid=sc.nextInt();
	
	System.out.println("Enter Ename");
	String en=sc.nextLine();
	System.out.println("Enter Email");
	String email=sc.nextLine();
	String sql="call insert stud(?,?,?)";
	
	cs=con.prepareCall(sql);
cs.setInt(1, eid);
cs.setString(2, en);
cs.setString(3, email);
	boolean b1=cs.execute();
	
}catch(Exception e){
	e.printStackTrace();
}}

}
