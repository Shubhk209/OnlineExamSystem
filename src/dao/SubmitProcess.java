package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.UserMarks;

public class SubmitProcess {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt= null;
	boolean flag=false;
	
	public boolean InsertMarks(UserMarks um){
		

		con =DbConnect.getConnection();
		
		//Retrieve the data from model
		String uname=um.getUsername(); //get the username from model
		System.out.println("Db get uname from model- "+uname);
		
		//Retrieve the userid from login table
		String q1="SELECT login_id from login_table where username=?";
		
		
		try {
			pstmt =con.prepareStatement(q1);
			pstmt.setString(1,uname);
			rs=pstmt.executeQuery();
		
			if(rs.next()) {
				int id=rs.getInt("login_id");	//login_id is table attribuute
				um.setUser_id(id);				//id has the value of attribute from table
				System.out.println("get userid from resultset- "+ id);
				
			}else {
				
				System.out.println("does not fetch user id from database");
				
			}
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end of catch of pstmt
		
		
		//insert the data into result table
		
		
		try {
			
			//retrieve from the model to insert into the table
			int id=um.getUser_id();
			System.out.println("User id from the model for submit in result table- "+ id);
			int m=um.getMark_ob();
			System.out.println("Marks Obtained from the model for submit in result table- "+ m);
			int t=um.getTotal_mk();
			System.out.println("Total Marks from the model for submit in result table- "+ t);
			
			String q2="INSERT into result_table(login_id,marks_obtained,total_marks) VALUES (?,?,?)";
			
			
			pstmt = con.prepareStatement(q2);
			
			pstmt.setInt(1, id);
			pstmt.setInt(2, m);
			pstmt.setInt(3, t);
			
			int status= pstmt.executeUpdate();
			
			if (status>0) {
				return true;
				
			}else {
				return false;
			}// end of if else status checking
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end of insert of marks in table try catch
		
		
		return flag;
		
		}//end of InserMarks method()
	}// end of the class
