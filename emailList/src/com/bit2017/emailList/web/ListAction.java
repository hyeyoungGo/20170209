package com.bit2017.emailList.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2017.emailList.dao.EmailListDao;
import com.bit2017.emailList.vo.EmailListVo;
import com.bit2017.web.Action;
import com.bit2017.web.util.WebUtil;

public class ListAction implements Action {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		EmailListDao dao = new EmailListDao();
		List<EmailListVo> list = dao.getList();
		
		// forward( request 연장, request dispatch )
		request.setAttribute("list", list);  // 데이터를 담아서 request
		WebUtil.forward("/WEB-INF/views/form.jsp", request, response);

	}

}
