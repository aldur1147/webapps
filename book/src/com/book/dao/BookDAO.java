package com.book.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.book.dto.BookVO;
import com.book.util.DBManager;

public class BookDAO {
	
	private BookDAO() {
		
	}
	private static BookDAO instance = new BookDAO();
	
	public static BookDAO getInstance() {
		return instance;
	}

	//상세보기
	
	
	//대출상태
	
}
