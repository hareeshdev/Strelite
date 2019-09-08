package com.jlcindia.jdbc;
import java.sql.*;
public class Lab1 {
public static void main(String args[]) throws SQLException{
	Connection con=null;
	Statement st=null;
	try {
		Class.forName("jdbc.myql.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:Raja","root","tiger");
		String sql="insert into stud values(1001,'Harish','harish@gmail.com')";
		st=con.createStatement();
		int x=st.executeUpdate(sql);
		
	} catch (ClassNotFoundException e) {
			e.printStackTrace();
	}
	

}
}
