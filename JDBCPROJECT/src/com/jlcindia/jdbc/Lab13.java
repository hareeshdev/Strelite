package com.jlcindia.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;
import javax.sql.*;



public class Lab13 {
	public static void main(String args[]){
		Connection con=null;
		CallableStatement cs=null;
		ResultSet rs=null;
try{
	con=JDBCUtil.getmysqlConncetion();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Eid");
	int eid=sc.nextInt();
	
	System.out.println("Fee Installment");
	float fee=sc.nextFloat();
	String sql="call insert stud(?,?)";
	cs=con.prepareCall(sql);
	cs.setInt(1, eid);
	cs.setFloat(1, fee);

}catch(Exception e){
	e.printStackTrace();
	}}
}