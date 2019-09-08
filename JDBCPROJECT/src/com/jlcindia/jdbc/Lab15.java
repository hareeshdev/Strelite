package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab15 {
public static void  main(String args[]){
	Connection con=null;
	Statement st=null;
	try{
		con=JDBCUtil.getmysqlConncetion();
		st=con.createStatement();
		String st1="intser into stud  values('1001')";
		st.addBatch(st1);
		String st2="update   stud set eid=1001";
		st.addBatch(st2);
		String st3="delete from  stud where stud=1001";
		st.addBatch(st3);
int x[]=st.executeBatch();
for(int i=0;i<x.length;i++){
	System.out.println(i+"\t"+x[i]);
}
		
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
