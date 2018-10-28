package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Person;
import model.User;

public class DatabaseOps {
	
	Connection con;
	ResultSet rs;
	PreparedStatement pstmt;
	Statement st;
	
	
	public boolean InsertUser(Person user)
	{
		boolean flag = false;
	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}//end of try block 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end of catch block	
		
		
		try {
		
			
			con = DriverManager.getConnection("jdbc:mysql://localhost/onlinetestdb","root","root");
		
			String n = user.getPname();
			System.out.println("uname database- "+n);
			String p = user.getPpass();
			
			System.out.println("pwd database- "+p);
			
			String f = user.getPfname();
			System.out.println("database -"+f);
			String e = user.getPemail();
			System.out.println("database- "+e);
			String cn = user.getPCname();
			System.out.println("database- "+cn);
			
			//insert the reg form data into table
			String query = "INSERT into reg_table(username,password,full_name,email,collage_name) VALUES (?,?,?,?,?)";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, n);
			pstmt.setString(2, p);
			pstmt.setString(3, f);
			pstmt.setString(4, e);
			pstmt.setString(5, cn);
			
			int status = pstmt.executeUpdate();
			System.out.println(status);  //no of column get affected
			
			if(status > 0) //check the no of column affected
			{
				flag = true;
				System.out.println(" fetched data from form uname and pass-"+n);
				System.out.println("fetched data from form uname and pass-"+p);
				//Get the Registered Data From the Registration table and insert the data into login table 
				String q1="SELECT reg_id, username, password from reg_table where username= ? and password= ?";
				
				
				pstmt= con.prepareStatement(q1);
				
				System.out.println("uname Value for select from reg_t-"+n);
				pstmt.setString(1, n);  //username is set for query
				System.out.println("upass Value for select from reg_t-"+p);
				pstmt.setString(2, p);	//password is set for query
				
				rs=pstmt.executeQuery();
				
				
				while(rs.next()) {
				int id=rs.getInt("reg_id");
				System.out.println("fetched data from table registration table-"+id);
				String uname=rs.getString("username");
				System.out.println("fetched data from table registration table-"+id);
				String upass=rs.getString("password");
				System.out.println("fetched data from table registration table-"+id);
				
				String q2="Insert into login_table(reg_id,username,password) values (?,?,?)";
				pstmt = con.prepareStatement(q2);
				
				pstmt.setInt(1, id);
				pstmt.setString(2, uname);
				pstmt.setString(3, upass);
				
				int a=pstmt.executeUpdate();
				System.out.println("No of row changes in "+a);
				return flag=true;
				
				}
				
			
			}else
			{
				flag = false;
			}
			
			}catch (SQLException e){
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
		
		return flag; //if there any exception happen the DatabaseOps insert method send false boolean 
		
		
	}
	}
	
	