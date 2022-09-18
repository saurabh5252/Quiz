package com.sjprogramming.quizapp;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserInput {
	
		PreparedStatement prs = null;
		Connection con = null;

		public  void insertParticipants(String StudentName, int Score, String Class) {
			try {
				ConnectionTest connectiontest = new ConnectionTest();
				con = connectiontest.getConnectionDetails();
				prs = con.prepareStatement("insert into user(StudentName,Score,Class)values(?,?,?)");
				prs.setString(1, StudentName);
				prs.setInt(2, Score);
				prs.setString(3, Class);
				int i = prs.executeUpdate();
				System.out.println("Record is Update Successfully" + i);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	//public static void main(String[] args) {
		
		
		
	}

//}
