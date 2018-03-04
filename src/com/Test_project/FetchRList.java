package com.Test_project;

import java.sql.*;
import java.util.ArrayList;

public class FetchRList {

	public static ArrayList<RListDTO> show() {

		RListDTO reading = null;
		ArrayList<RListDTO> readingList = new ArrayList<RListDTO>();
		String sql = "SELECT INF.ID,INF.NAME,ADR.ADDRESS  "
				+ "FROM JALALABAD.TESTJ_INFO INF, JALALABAD.TESTJ_ADD ADR "
				+ "WHERE INF.ID= ADR.ID " + "ORDER BY ID ";

		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@172.16.0.143:1521:orcl", "JALALABAD",
					"jalalabad");
			ps = con.prepareStatement(sql);

			ResultSet r = ps.executeQuery();
			while (r.next()) {

				reading = new RListDTO();
				reading.setId(r.getInt("ID"));
				reading.setName(r.getString("NAME"));
				reading.setAddress(r.getString("ADDRESS"));
				readingList.add(reading);

			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return readingList;
	}

}
