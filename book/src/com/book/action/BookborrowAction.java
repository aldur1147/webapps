package com.book.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.dao.BookDAO;

public class BookborrowAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println(request.getParameter("title"));
		String title = request.getParameter("title");
		
		BookDAO bdo = BookDAO.getInstance();
		bdo.bookBorrow(title);
		
		response.sendRedirect("");
	}

}
