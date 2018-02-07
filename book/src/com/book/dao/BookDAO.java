package com.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.book.dto.MemberVO;
import com.book.util.DBManager;

public class BookDAO {
	private BookDAO() {}

	private static BookDAO instance = new BookDAO();
	
	public static BookDAO getInstance() {
		return instance;
	}
	
	//select
	//아이디 중복체크
	public void bookIdcheck() {
		
	}
	
	//insert
	//회원가입
	public void bookJoin(MemberVO mvo) {
		String sql = "insert into member values(?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mvo.getUserid());
			pstmt.setString(2, mvo.getPwd());
			pstmt.setString(3, mvo.getName());
			pstmt.setString(4, mvo.getEmail());
			pstmt.setString(5, mvo.getPhone());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBManager.close(conn, pstmt, null);
		}
		
	}
	//update
	//delete
	
	
}
