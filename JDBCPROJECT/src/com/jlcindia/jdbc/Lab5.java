package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab5 {
	public static void main(String args[]){
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;

	try{
		
		con=JDBCUtil.getoracleConncetion();
		String st1="select *from stud";
		st=con.createStatement();
		rs=st.executeQuery(st1);
		if(rs.next())do{
			rs.getInt(1);
			rs.getString(2);
			rs.getString(3);
			System.out.println("Recerod is retivwe");
		}while(rs.next());
		
		
			System.out.println("Recerod is Not insert");
	}catch(Exception e){
		e.printStackTrace();
	}
	}

}
