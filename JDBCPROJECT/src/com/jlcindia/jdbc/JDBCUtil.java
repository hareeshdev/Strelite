package com.jlcindia.jdbc;
import java.sql.*;
public class JDBCUtil {
static{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("orcale.jdbc.driver.OracleDriver");
		
	}catch(Exception e){
		e.printStackTrace();
	}}
	public static Connection getoracleConncetion() throws SQLException{
	String sql="jdbc:oracle:thin:@localhost:1521:XE";
	Connection con=DriverManager.getConnection(sql);
		return con;
	}
public static Connection getmysqlConncetion() throws SQLException{
	String mysql="jdbc:mysql://localhost:3306/tcsdb";
	Connection con=DriverManager.getConnection(mysql);
	return con;
}
public static void cleanup(Statement st,Connection con){
	try{
		if(st!=null)st.close();
		if(con!=null)con.close();
	}catch(Exception e){
		e.printStackTrace();
	}}
public static void cleanup(ResultSet rs,Statement st,Connection con){
	try{
		if(rs!=null)rs.close();
		if(st!=null)st.close();
		if(con!=null)con.close();
	}catch(Exception e){
		e.printStackTrace();
	}
}
}

