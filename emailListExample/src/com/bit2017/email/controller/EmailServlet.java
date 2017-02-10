package com.bit2017.email.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2017.email.dao.EmailDao;
import com.bit2017.email.vo.EmailVo;

@WebServlet("/el")
public class EmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionName = request.getParameter("a");
		
		if("from".equals(actionName)) {
			
		} else if("add".equals(actionName)) {
			
		} else {
			EmailDao dao = new EmailDao();
			List<EmailVo> list = dao.getList();
			
			request.setAttribute("list", list);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/viewer/list.jsp");
			
			rd.forward(request, response);
			
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
