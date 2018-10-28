package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class QuestionPlink extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public QuestionPlink() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		// TODO Auto-generated method stub
		
		
		HttpSession session= request.getSession(false);
		String link =session.getAttribute("paperlink").toString();
		System.out.println("QuestionPlink servlet- "+link);
		
		response.sendRedirect(link);
		
		
		
		
	
	
	
	
	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		service(request, response);
	}

}
