package com.jlcindia.jdbc;
import java.sql.*;
import java.util.Scanner;
import java.io.*;
public class Lab7 {
public static void main(String args[]){
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	try{
		con=JDBCUtil.getmysqlConncetion();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Empolyee Id");
		int eid=sc.nextInt();
		String sql=String .format("select *from stud where eid=%d",eid);
		st=con.createStatement();
		rs=st.executeQuery(sql);
		if(rs.next()){
			int eid1=rs.getInt(1);
			String ename=rs.getString(2);
			String email=rs.getString(3);
			System.out.println(eid1+"\t"+ename+"\t"+email);
		}else{
			System.out.println("Record is Not Found");
					}
		
				
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(rs, st, con);
	}
}
}
