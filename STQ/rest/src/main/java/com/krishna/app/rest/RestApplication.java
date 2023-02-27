package com.krishna.app.rest;
import java.sql.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);

		//code for connecting mysql
//		try{
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con=DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/credusers","root","Krish@1997");
//here dbnew is database name, root is username and password
//			Statement stmt=con.createStatement();
//end of connection code @mysql


//			ResultSet rs=stmt.executeQuery("select * from user;");
//			while(rs.next())
//				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
//			con.close();
//		}catch(Exception e){ System.out.println(e);}





	}

}
