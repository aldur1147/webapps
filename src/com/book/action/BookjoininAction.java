package com.book.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.dao.BookDAO;
import com.book.dto.MemberVO;

public class BookjoininAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVO mvo = new MemberVO();
		mvo.setUserid(request.getParameter("userid"));
		mvo.setPwd(request.getParameter("pwd"));
		mvo.setName(request.getParameter("name"));
		mvo.setEmail(request.getParameter("email"));
		mvo.setPhone(request.getParameter("phone"));
		BookDAO bDao = BookDAO.getInstance();
		bDao.bookJoin(mvo);
		
		response.sendRedirect("/book/Book.do?command=join");
	}

}
