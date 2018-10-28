package controller;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginVerify;
import model.User;


public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		PrintWriter out = response.getWriter(); 
		
		String user=request.getParameter("uname");
		String pass=request.getParameter("upass");
		
		//create model.User object
		User exUser= new User();
		
		exUser.setUser_name(user);
		exUser.setUser_pass(pass);
		
		//LoginDao object
		LoginVerify dbops= new LoginVerify();
		boolean v =dbops.verifyUser(exUser);
		
		//check whether the verification of login & pass in LoginVerify class return true 
		if(v==true){
			HttpSession session= request.getSession();
			session.setAttribute("username", user);	//set username 
			response.sendRedirect("CandidateLogintest.jsp");
			//redirect to candidate next page after login
		}else {
			
			out.println("<center><font color=White>Incorrect UserName/Password</font></center>");
			RequestDispatcher redirect = request.getRequestDispatcher("login.jsp");
			redirect.include(request, response);
			}
		}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		service(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		service(request, response);
	}

}
