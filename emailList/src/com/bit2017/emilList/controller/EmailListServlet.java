package com.bit2017.emilList.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2017.emailList.web.EmailListActionFactory;
import com.bit2017.web.Action;
import com.bit2017.web.ActionFactory;

@WebServlet("/el")
public class EmailListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 방식을 넘어오는 문자열 데이터의 엔코딩
		request.setCharacterEncoding("utf-8");
		String actionName = request.getParameter("a");   // 요청을 분기함.
		
		//요청이 무엇인가?
		ActionFactory af = new EmailListActionFactory();
		Action action = af.getAction(actionName);
		action.execute(request, response);
		/*
		if("form".equals(actionName)) {
			WebUtil.forward("/WEB-INF/views/form.jsp", request, response);		

		} else if("add".equals(actionName)) {
			String firstName = request.getParameter("fn");
			String lastName = request.getParameter("ln");
			String email = request.getParameter("email");
			
			EmailListVo vo = new EmailListVo();
			vo.setFirstName(firstName);
			vo.setLastName(lastName);
			vo.setEmail(email);
			
			EmailListDao dao = new EmailListDao();
			dao.insert(vo);
			
			WebUtil.redirect(request.getContextPath() + "/el", request, response);
			
		} else {
			 defalut request = list 
			EmailListDao dao = new EmailListDao();
			List<EmailListVo> list = dao.getList();
			
			// forward( request 연장, request dispatch )
			request.setAttribute("list", list);  // 데이터를 담아서 request
			WebUtil.forward("/WEB-INF/views/form.jsp", request, response);
			
		}
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter printWriter = response.getWriter();
				
		printWriter.println("<h1>벨로~</h1>");*/
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
