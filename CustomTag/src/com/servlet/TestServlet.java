package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test.demo")
public class TestServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		boolean error = false;
		if (name == null || name.trim().isEmpty()) {
			req.setAttribute("name", "Name is mandatory.");
			error = true;
		}
		if (email == null || email.trim().length()==0) {
			req.setAttribute("email", "Email is mandatory.");
			error = true;
		}
		if(!error) {
			req.getRequestDispatcher("home.jsp").forward(req, res);
		}else {
			req.getRequestDispatcher("index.jsp").forward(req, res);
		}
	}
}
