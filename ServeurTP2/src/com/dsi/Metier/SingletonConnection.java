package com.dsi.Metier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class SingletonConnection {
	
	public static void main (String args[]) {
		
		getConnection();
		
		

	}
	
	
	
	
	private static Connection connection ; 
	static {
		
		try {
			Class.forName("com.mysql.jdbc.drive");
			
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/banque","root","");
			
			
		}
		
		catch (ClassNotFoundException ex){
			
			System.out.println("Probleme de pilote base de donnee");
			System.out.println(ex.getMessage());
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection ;
	}
	

}
