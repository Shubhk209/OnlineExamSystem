package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;
import model.admin;

public class LoginVerify {
	
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt= null;
	boolean flag=false;
	
	public boolean verifyUser(User u) {
		boolean flag=false;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/onlinetestdb","root","root");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		String n = u.getUser_name();
		System.out.println("Login dao user name check-"+n);
		String p = u.getUser_pass();
		System.out.println("Login dai user name check-"+p);
		
		String query="SELECT * from login_table where username=? and password=?";
		
		try {
			
			pstmt =con.prepareStatement(query);
			pstmt.setString(1,n);
			pstmt.setString(2, p);
			
			rs=pstmt.executeQuery();
			
			//check whether user and pass is registered or not
			//if the pointer of RS goes to next then user is valid and return true boolean to 
			if(rs.next()){
				return flag=true;
			}else {
				return flag=false;
			}
			}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
}//end of method


	public boolean verifyadmin(admin a) {
		
		try {
			con =DbConnect.getConnection();
			
			String n = a.getUser_name();
			System.out.println("Login dao user name check-"+n);
			String p = a.getUser_pass();
			System.out.println("Login dai user name check-"+p);
			
			String query="SELECT * from admin_table where username=? and password=?";
			pstmt =con.prepareStatement(query);
			pstmt.setString(1,n);
			pstmt.setString(2, p);
			
			rs=pstmt.executeQuery();
		
			//check whether user and pass is registered or not
			//if the pointer of RS goes to next then user is valid and return true boolean to 
			if(rs.next()){
				return flag=true;
			}else {
				return flag=false;
				}//rs.next if block
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return false;	
	}





}//end of class
