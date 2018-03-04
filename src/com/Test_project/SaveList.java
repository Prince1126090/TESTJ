package com.Test_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SaveList {
	

	
	
	
	
	
	
	
	
	
	
	public static String SaveL(SaveL reading )
	{
		
		String sql = "INSERT ALL " +
				"INTO TESTJ_INFO (ID,NAME) values (?,?) " +
				"INTO TESTJ_ADD (ID,ADDRESS) values (?,?) " +
				"SELECT * FROM dual " ;

		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@172.16.0.143:1521:orcl", "JALALABAD",
					"jalalabad");
			ps = con.prepareStatement(sql);
			ps.setInt(1, reading.getId());
			ps.setString(2, reading.getName());
			ps.setInt(3, reading.getId());
			ps.setString(4, reading.getAddress());
			
			
			ps.executeUpdate();

		
			con.commit();
			con.close();
			return "success";

		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
		
		
	}
	

}
