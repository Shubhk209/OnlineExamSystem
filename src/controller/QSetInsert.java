package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.QuestionSetDao;
import model.QuestionSet;

public class QSetInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public QSetInsert() {
		super();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String s = request.getParameter("set_name"); // set name of the question paper
		System.out.println("fetch from txt set name of the question paper- " + s);

		String pc = request.getParameter("p_code"); // paper code of the Question set
		System.out.println("fetch from txt paper code of the question paper- " + pc);

		String pl = request.getParameter("jsp_name"); // paper link of jsp page
		System.out.println("fetch from txt paper link  of the question paper" + pl);

		// create object of the QuestionSet Model and set the values
		QuestionSet q = new QuestionSet();
		q.setSet_name(s); // set name
		q.setP_code(pc); // paper code
		q.setP_link(pl); // paperlink

		QuestionSetDao db = new QuestionSetDao();
		boolean recordinsert = db.InsertQset(q);

		if (recordinsert) {
			out.println("<center class=Status><font color=Blue>Record has been inserted</font></center>");
			RequestDispatcher redirect = request.getRequestDispatcher("adminQset.jsp");
			redirect.include(request, response);

		} else {
			out.println("<center  class=Status><font color=Blue>Record hasn't been inserted</font></center>");
			RequestDispatcher redirect = request.getRequestDispatcher("adminQset.jsp");
			redirect.include(request, response);
		}

	}// end of service method

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service(request, response);
	}

}
