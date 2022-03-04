package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
	public static boolean insertStudentToDB(Student st) {
		
		boolean f = false;
		try { 
			//jdbc code..
			Connection con = ConnectionProvider.createC();
			String q = "insert into students(sname, sphone, scity) values(?, ?, ?)";
			//preparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the value of parameter
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3,  st.getStudentCity());
			
			//execute..
			pstmt.executeUpdate();
			f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
