package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class Lab4 {
public static void main(String args[]){
	Connection con=null;
	Statement st=null;
	try{
		con=JDBCUtil.getmysqlConncetion();
		String sql="insert into stud values(1002,'Mohan','info@in.com')";
		st=con.createStatement();
		int x=st.executeUpdate(sql);
		if(x==1)
			System.out.println("Recerod is insert");
		else
			System.out.println("Recerod is Not insert");
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{
		JDBCUtil.cleanup(st, con);
	}
}
}
