package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.QuestionSet;

public class QuestionSetDao {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	boolean flag = false;

	public boolean InsertQset(QuestionSet q) {

		try {
			con = DbConnect.getConnection();

			// Retrieve the values from model

			String s = q.getSet_name();
			System.out.println("Dao set name: " + s);

			String pc = q.getP_link();
			System.out.println("Dao paper code: " + s);

			String pl = q.getSet_name().toString();
			System.out.println("Dao paper link: " + s);

			// insert the reg form data into table
			String query = "INSERT into question_set(set_name,paper_code,paper_link) VALUES (?,?,?)";

			pstmt = con.prepareStatement(query);

			pstmt.setString(1, s);
			pstmt.setString(2, pc);
			pstmt.setString(3, pl);

			int status = pstmt.executeUpdate();
			System.out.println(status); // no of column get affected

			con.close(); // close the connection

			// check whether data get inserted or not
			if (status > 0) {
				return true;

			} else {
				return false;
			} // end of if (status>0)

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // end of try catch

		return flag;
	}// end of method

}// end of class
