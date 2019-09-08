package com.jlcindia.jdbc;
import java.sql.*;
public class Lab2 {
public static void main(String args[]){
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	try{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:MYDSN","root","tiger");
		String st1="select * from stud";
		st=con.createStatement();
		rs=st.executeQuery(st1);
		while(rs.next()){
			int id=rs.getInt(1);
			String sname=rs.getString(2);
			String email=rs.getString(3);
			System.out.println(id+"\t"+sname+"\t"+email);
		}
	}catch(Exception e){
		
	}finally{
		try{
			rs.close();
			if(st!=null)st.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
}
