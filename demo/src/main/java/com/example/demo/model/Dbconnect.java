package com.example.demo.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Dbconnect {
	//@SuppressWarnings("null")
	public void getData() {
	
		Connection conn = null;
		Statement stmt;
		//STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      try {
	    	  
			stmt = conn.createStatement();
			 String sql = "SELECT * from student_data";
		     ResultSet rs = stmt.executeQuery(sql);
		     
		     while(rs.next()){
		         //Retrieve by column name
		         int Sid  = rs.getInt("Student_id");
		         String fname = rs.getString("FirstName");
		         String lname = rs.getString("LastName");
		         String company = rs.getString("Company");

		         //Display values
		         System.out.print("ID: " +Sid);
		         System.out.print(", Age: " + fname);
		         System.out.print(", First: " + lname);
		         System.out.println(", Last: " + company);
		      }
		      rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	     

}
}
