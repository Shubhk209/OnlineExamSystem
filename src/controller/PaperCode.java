package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.P_CodeDao;
import model.Paper_code_model;


public class PaperCode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PaperCode() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	PrintWriter out = response.getWriter();
    	
    	
    	String p_code=request.getParameter("paper_code");
    	System.out.println(p_code);
    	
    	//create object of model.Paper_code_model class and set the value of papercode
    	Paper_code_model p= new Paper_code_model();
    	p.setP_code(p_code);
    	
    	
    	P_CodeDao pcode=new P_CodeDao();
    	boolean check=pcode.verifyP_code(p);
    	System.out.println("Boolean Cheeck of pcode Dao "+ check);
    	
    	if (check == true) {
    		
    		String link =p.getP_link();
    		System.out.println("Check the plink at controller- "+link);
    		HttpSession session= request.getSession();
			session.setAttribute("paperlink", link);
			response.sendRedirect("instruction.jsp");
    	
    	
    	}else {
    			
    			out.println("<center><font color=Yellow>Incorrect PaperCode</font></center>");
    			RequestDispatcher redirect = request.getRequestDispatcher("CandidateLogintest.jsp");
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
