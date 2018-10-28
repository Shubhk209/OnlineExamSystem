package dao;

import java.sql.*;



import model.Question;

public class QuestionDao {

	public void InsertQues(Question ques) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt= null;

		
		
		con =DbConnect.getConnection();
		
		
		String question= ques.getQuestion();
		System.out.println("uname database- "+question);
		
		String optionA = ques.getOptionA();
		System.out.println(" set optionB at database- "+optionA);
		
		String optionB = ques.getOptionB();
		System.out.println(" set optionB at database- "+optionB);
		
		String optionC = ques.getOptionC();
		System.out.println(" set optionC at database- "+optionC);
		
		String optionD = ques.getOptionD();
		System.out.println(" set optionD at database- "+optionD);
		
		String correctOp = ques.getCorrectOp();
		System.out.println(" set Correct option at database- "+correctOp);
		
		//insert the reg form data into table
		
		String query = "INSERT into Question_table(username,password,full_name,email,collage_name) VALUES (?,?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pstmt.setString(1, question);
			pstmt.setString(2, optionA);
			pstmt.setString(3, optionB);
			pstmt.setString(4, optionC);
			pstmt.setString(5, optionD);
			
			int status = pstmt.executeUpdate();
			System.out.println(status);  //no of column get affected
			
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
		
	}
}
