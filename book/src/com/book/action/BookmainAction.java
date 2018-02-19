package com.book.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.dao.BookDAO;

public class BookmainAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookDAO bdo = BookDAO.getInstance();
		//메인 페이지의 필요 내역 들고오기
		
		RequestDispatcher dispathcer = request.getRequestDispatcher("member/main.jsp");
		dispathcer.forward(request, response);
	}

}
