package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Lab8 {
public static void main(String args[]){
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	try{
		con=JDBCUtil.getmysqlConncetion();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quary");
		int eid=sc.nextInt();
				String sql=String.format("select *from stud where eid=%d",eid);
				st=con.createStatement();
				 boolean b1=st.execute(sql);
				 if(b1){
					 rs=st.getResultSet();
				
					 do{
						 int eid1=rs.getInt(1);
							String ename=rs.getString(2);
							String email=rs.getString(3);
							System.out.println(eid1+"\t"+ename+"\t"+email);

						 
					 }while(rs.next());
				 }else{
					 int x=st.getUpdateCount();
					 System.out.println(x);
				 }
				 
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(rs, st, con);
	}
}
}
