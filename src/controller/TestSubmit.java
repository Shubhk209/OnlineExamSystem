package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SubmitProcess;
import model.UserMarks;


public class TestSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int marks_opt = 0; 
		int t_ques=10;
		
		//retrieve the user name from 
		HttpSession session= request.getSession(false);
		String username =session.getAttribute("username").toString();	//fetching the username from session attribute
		System.out.println("Fetched username from session attribute=username : "+username);
		
		
		//to take parameter for paper 
		for(int i=1;i<=11;i++) {
			
			
			String s_op= request.getParameter("q"+i);
			System.out.println("Value fetch of q"+i+" from the radio from jsp: "+s_op);
			String c_op= request.getParameter("q"+i+"_c");
			System.out.println("hidden Value of q"+i+"_c fetch from the radio from jsp: "+c_op);
			
			if (s_op!=null) {
				
				if (s_op.equals(c_op)) {
					
					marks_opt= marks_opt+1;			//marks calculated 
					System.out.println("Marks :"+ marks_opt);
					
					System.out.println("Value of i = "+ i);
					System.out.println("Value of t_ques "+t_ques);
					
					}else {
						
					System.out.println("Option is not correct so, no Marks");
						
				}//option check block end here
			}// end of s_op1=null block
			else 
			{
				System.out.println("no option selected, so no mark");
				
			}//null if ends here
			System.out.println("value of i before"+i);
			
			if (i==t_ques) {
				System.out.println("Enter the i==t_ques if block");
				//create the model of UserMarks and set the attributes
				UserMarks um= new UserMarks();
				um.setMark_ob(marks_opt);
				
				um.setTotal_mk(t_ques);
				um.setUsername(username);
				
				
				//create the object of submitprocess Dao class
				SubmitProcess st= new SubmitProcess();
				boolean c=st.InsertMarks(um);
				
				if (c==true) {
				response.sendRedirect("candidatelogout.jsp"); //jsp page where to send the 	
					
				}else {
					
					System.out.println("Something Gone Wrong so Contact the Admin");
					
				}
				
				
				
				
			}//end of if(i==t_ques) block
			
			
				
			}//for loop end here 
			System.out.println(marks_opt);

	
	
	
	
	
	
	
	
	
	}//end of service method

	
	
	
	
	
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		service(request, response);
	}

}
