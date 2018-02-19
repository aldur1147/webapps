package com.book.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.dao.BookDAO;
import com.book.dto.BookVO;

public class BooksearchAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("검색어 :"+request.getParameter("search"));
		
		System.out.println("찾는 부분 :"+request.getParameter("find_search"));
		
		BookDAO bDao = BookDAO.getInstance();
		List<BookVO> lbd = null;
		
		if(request.getParameter("find_search").equals("title")) {
			
			lbd = bDao.bookFind(request.getParameter("find_search"), request.getParameter("search"));
		}
		else if(request.getParameter("find_search").equals("writer")) {
			
			lbd = bDao.bookFind(request.getParameter("find_search"), request.getParameter("search"));
		}
		else if(request.getParameter("find_search").equals("publisher")) {
			
			lbd = bDao.bookFind(request.getParameter("find_search"), request.getParameter("search"));
		}
		else {
			System.out.println("db연결 실패");
		}
		request.setAttribute("sh", request.getParameter("search"));
		request.setAttribute("search", lbd);
		
		System.out.println("sh:"+request.getAttribute("sh"));
		System.out.println(request.getAttribute("search"));
		System.out.println(request.getAttribute("search").toString().length());
		if(request.getAttribute("search").toString().length()==2) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/member/nonsearch.jsp");
			
			try {
				dispatcher.forward(request, response);
			}
			catch (Exception e) {
				e.getStackTrace();
			}
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/member/serachurl.jsp");
		
			try {
				dispatcher.forward(request, response);
			}
			catch (Exception e) {
				e.getStackTrace();
			}
		}
	}

}
