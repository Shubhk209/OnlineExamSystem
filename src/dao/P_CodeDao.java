package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Paper_code_model;

public class P_CodeDao {

	
	public boolean verifyP_code(Paper_code_model p) {
		
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt= null;
		boolean flag=false;

		con =DbConnect.getConnection();
		
		// set p_code getting it from model.Paper_code_model object 
		String p_code= p.getP_code();
		
		System.out.println("Db set pcode from model- "+p_code);
		
		
		String q= "SELECT paper_link FROM question_set where paper_code=? ";
		
		try {
			pstmt=con.prepareStatement(q);
			pstmt.setString(1, p_code);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String a=rs.getString("paper_link");
				p.setP_link(a);			//set Paper-link at the model
				System.out.println("get plink from resultset- "+ a);
				return true;
				}//end of if 
			else{
					return false;				
					}//end of else
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.print("Error occur here");
			e.printStackTrace();
		}//end of try catch
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
		}
}
