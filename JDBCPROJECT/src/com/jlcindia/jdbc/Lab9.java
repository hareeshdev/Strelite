package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Lab9 {
public static void main(String args){
Connection con=null;
PreparedStatement ps=null;
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
	String sql="insert into values(?,?,?,?)";
	ps=con.prepareStatement(sql);
	ps.setInt(1, eid);
	ps.setString(2, en);
	ps.setString(3, email);
	int x=ps.executeUpdate();
	if(x==1){
		System.out.println("Record Is Insert");
	}else{
		System.out.println("Record is Not Found");
	}
}catch(Exception e){
	e.printStackTrace();
}finally{
	JDBCUtil.cleanup(rs, ps, con);
}
}
}
