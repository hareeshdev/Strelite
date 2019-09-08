package com.jlcindia.jdbc;

import java.sql.*;

public class Lab17 {
public static void main(String args[]){
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	try{
		con=JDBCUtil.getmysqlConncetion();
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		rs=st.executeQuery(" select *form stud");
		System.out.println("***FORWARD DIRECTION");
		while(rs.next()){
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			
		}
		System.out.println("***FORWARD DIRECTION");
		rs.moveToInsertRow();
		rs.updateInt(1, 1001);
		rs.insertRow();rs.absolute(3);
		rs.deleteRow();
		System.out.println("***Reverse DIRECTION");
		while(rs.previous()){
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			rs.first();
			rs.last();
			rs.absolute(4);
			rs.relative(2);
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
