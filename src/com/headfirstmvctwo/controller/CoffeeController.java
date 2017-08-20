package com.headfirstmvctwo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.headfirstmvctwo.model.CoffeeExpertModel;

public class CoffeeController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//PrintWriter out=resp.getWriter();
		//out.println("<br>Hello There!");
		String choice=req.getParameter("color");
		//out.println("<br>You have selected "+choice+" color!");
		
		CoffeeExpertModel model=new CoffeeExpertModel();
		List<String> advice=model.getAdvice(choice);
		/*Iterator<String> iterator=advice.iterator();
		while(iterator.hasNext()){
			out.println("<br>You should try "+iterator.next());
		}*/
		
		req.setAttribute("styles", advice);
		
		RequestDispatcher view=req.getRequestDispatcher("result.jsp");
		
		view.forward(req, resp);
	}

}
