package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Lab10 {
public static void main(String args[]){
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
try{
	con=JDBCUtil.getmysqlConncetion();
	String quary="select * from stud where eid=?";
	ps=con.prepareStatement(quary);
		rs=ps.executeQuery();
if(rs.next()){
	int eid1=rs.getInt(1);
	String ename=rs.getString(2);
	String email=rs.getString(3);
	System.out.println(eid1+"\t"+ename+"\t"+email);
}	else{
	System.out.println("Eid is not found");
}
}catch(Exception e){
	e.printStackTrace();
}finally{
	JDBCUtil.cleanup(rs, ps, con);
}
}
}
