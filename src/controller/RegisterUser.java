package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Person;
import dao.DatabaseOps;


public class RegisterUser extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out= response.getWriter();
		
		
		String uname=request.getParameter("r_uname");
		System.out.println("txt set password- "+uname);
		
		String upass=request.getParameter("r_upass");
		System.out.println("txt set password- "+upass);
		
		String ufname=request.getParameter("r_fname");
		System.out.println("txt set fullname- "+ufname);
		
		String uemail=request.getParameter("r_email");
		System.out.println("txt set email- "+uemail);
		
		String ucName=request.getParameter("r_Cname");
		System.out.println("txt set collage- "+ucName);
		
		Person newUser= new Person();
		
	 
		newUser.setPname(uname);//set username
		
		newUser.setPpass(upass); //set password
		
		newUser.setPfname(ufname);
		newUser.setPemail(uemail);
		newUser.setPCname(ucName);
		
	DatabaseOps dbops= new DatabaseOps();
	boolean recordinsert= dbops.InsertUser(newUser);
	
	if(recordinsert)
	{
		RequestDispatcher view= request.getRequestDispatcher("login.jsp");
		view.forward(request, response); 	
		
	}else {
		
		out.println("<center><font color=red>Incorrect UserName/Password</font></center>");
		RequestDispatcher redirect = request.getRequestDispatcher("regUser.jsp");
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
