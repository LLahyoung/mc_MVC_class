package mc.sn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mc.sn.model.BusinessService;

public class ControllerServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("work");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Welcome!! Servlet!</h1>");
		BusinessService bs = new BusinessService();
		String result = bs.checkWorkingDatabase();
		
		HttpSession session = req.getSession();
		session.setAttribute("result", result);

		resp.sendRedirect("./day26/output_view.jsp");
		
		
//		if(bs!=null) {
//			out.print("db is working");
//		} else {
//			out.print("db is not working");
//		}
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}
}
