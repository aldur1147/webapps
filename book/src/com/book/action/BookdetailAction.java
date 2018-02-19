package com.book.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.dao.BookDAO;
import com.book.dto.BookVO;

public class BookdetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println(request.getParameter("title"));
		BookDAO bdo = BookDAO.getInstance();
		BookVO bvo = bdo.bookDetail(request.getParameter("title"));
		
		request.setAttribute("book", bvo);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/member/selectserach.jsp");
		dispatcher.forward(request, response);
	}

}
