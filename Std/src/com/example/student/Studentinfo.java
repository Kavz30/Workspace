package com.example.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Studentinfo {
	
	Scanner sc=new Scanner(System.in);
	private static Connection con=null;
	 Statement sta=null;
	 ResultSet rs = null;

public void display() throws SQLException {
	        System.out.println("Enter stdid");
	        int stdid=sc.nextInt();
	        String sql="select * from student_info where stdid= "+stdid;
	        
	        sta=con.createStatement();
	        
	        rs=sta.executeQuery(sql);
	        
	        if(rs.next()) {
	             stdid=rs.getInt("stdid");
	        	 String stdname=rs.getString("stdname");
	        	 int deptid=rs.getInt("deptid");
	        	System.out.println("id is"+" "+stdid);
	        	System.out.println("name is"+" "+stdname);
	        	System.out.println("dept id is"+" "+deptid);
	        }
	        else {
	        	System.out.println("No records found");
	        }
	        
	        
	    }

public static void main(String args[]) {
	 try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
         String addr = "jdbc:mysql://localhost:3306/data";
         String username = "root";
         String password = "root";
         
         con = DriverManager.getConnection(addr, username, password);
        
         if(con==null) {
         System.out.println("Connection not Established");}
         else {
        	 System.out.println("Connection Established");
         }
         
         Studentinfo std=new Studentinfo();
         std.display();
         
         
         
     }catch (ClassNotFoundException E) {

         }
             catch (SQLException e) {

         }

     }

}
