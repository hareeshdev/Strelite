package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class Lab11 {
	public static void main(String args[]){
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
try{
	con=JDBCUtil.getmysqlConncetion();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Quary");
	String qry=sc.nextLine();
	ps=con.prepareStatement(qry);
	boolean b1=ps.execute();
	if(b1){
		rs=ps.getResultSet();
	do{
		int eid1=rs.getInt(1);
		String ename=rs.getString(2);
		String email=rs.getString(3);
		System.out.println(eid1+"\t"+ename+"\t"+email);
	}while(rs.next());
	}else{
		int x=ps.getUpdateCount();
		System.out.println("Result is:"+x);
	}
}catch(Exception e){
	e.printStackTrace();
}
		
	}}
