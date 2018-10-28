package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginVerify;
import model.admin;

public class adminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public adminLogin() {
        super();
        
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter out= response.getWriter();
    	String user=request.getParameter("a_uname");
		String pass=request.getParameter("a_upass");
		
		//create object of admin model
		admin a= new admin();
		a.setUser_name(user);
		a.setUser_pass(pass);
		
		
		//create object of login verify
		LoginVerify lv= new LoginVerify();
		boolean v=lv.verifyadmin(a);
		
		
		if (v) {
			HttpSession session= request.getSession();
			session.setAttribute("username", user);	//set username 
			response.sendRedirect("adminQset.jsp");
			//redirect to candidate next page after login
			}else {
				
				out.println("<center><font color=White>Incorrect UserName/Password</font></center>");
				RequestDispatcher redirect = request.getRequestDispatcher("adminLogin.jsp");
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
