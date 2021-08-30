package com.facebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlData {
	
	public String mai() {
	//public static void main(String[] args) {
			
	Connection con =null;
	String value ="";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
		
		
		//String sqlQuery = "select * from register";
		String sqlQuery = "select FIRST_NAME from register";
		PreparedStatement ps = con.prepareStatement(sqlQuery);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
		//System.out.println(rs.getString("FIRST_NAME"));
		}
		}
		/*while (rs.next()) {
			String firstName = rs.getString("FIRST_NAME");
			String lastName = rs.getString("LAST_NAME");
			String address = rs.getString("Address");
			String email = rs.getString("EMAIL");
			long phone = rs.getLong("PHONE");
			String gender = rs.getString("GENDER");
			String hobbies = rs.getString("HOBBIES");
			String lang = rs.getString("LANGUAGES");
			String skills = rs.getString("SKILLS");
			String country = rs.getString("COUNTRY");
			String selCountry = rs.getString("SELECT_COUNTRY");
			String oassword = rs.getString("PASSWORD");
			String conPassword = rs.getString("CONFIRM_PASSWORD");
			int dob_Year = rs.getInt("DOB_YEAR");
			int dob_Date = rs.getInt("DOB_DATE");
			String dob_month = rs.getString("DOB_MONTH");
		
			System.out.println(firstName);
			System.out.println(lastName);
			System.out.println(address);
			System.out.println(email);
			System.out.println(phone);
			System.out.println(gender);
			System.out.println(hobbies);
			System.out.println(lang);
			System.out.println(skills);
			System.out.println(country);
			System.out.println(selCountry);
			System.out.println(oassword);
			System.out.println(conPassword);
			System.out.println(dob_Year);
			System.out.println(dob_month);
			System.out.println(dob_Date);
			}
*/		
		
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return value;
	

	
	}
	
}