package com.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.book.dto.BookVO;
import com.book.dto.MemberVO;
import com.book.util.DBManager;

public class BookDAO {
	private BookDAO() {}

	private static BookDAO instance = new BookDAO();
	
	public static BookDAO getInstance() {
		return instance;
	}
	
	//select
	//대출많은 도서 불러오기
	public void bookRank() {
		String sql="select * from book ";
	}
	//추천도서 사진찾기
	public void bookPicture() {
		String sql = "select * from ";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
	}
	//데이터 찾기 +db내용 추가될경우 수정
	public List<BookVO> bookFind(String find, String input){
		String sql = "select * from book where "+find+" like ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BookVO> lbv = new ArrayList<BookVO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			//pstmt.setString(1, find);
			pstmt.setString(1, "%"+input+"%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookVO bvo = new BookVO();
				bvo.setTitle(rs.getString("title"));
				bvo.setWriter(rs.getString("writer"));
				bvo.setOutdate(rs.getString("outdate"));
				bvo.setPublisher(rs.getString("publisher"));
				bvo.setNum(rs.getString("num"));
				bvo.setConfirm(rs.getInt("confirm"));
				lbv.add(bvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBManager.close(conn, pstmt, rs);
		}
		return lbv;
	}
	//책하나 찾기 +사진 추가
	public BookVO bookDetail(String title) {
		String sql = "select * from book where title=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BookVO vo = new BookVO();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setOutdate(rs.getString("outdate"));
				vo.setPublisher(rs.getString("publisher"));
				vo.setNum(rs.getString("num"));
				vo.setConfirm(rs.getInt("confirm"));
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return vo;
	}
	
	//insert
	
	//update
	//대출 시
	public void bookBorrow(String title) {
		String sql = "update book set confirm=1 where title=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBManager.close(conn, pstmt, null);
		}	
	}
	//반납 시 
	public void bookretake(String title) {
		String sql = "update book set confirm=1 where title=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBManager.close(conn, pstmt, null);
		}	
	}
	
	//delete
	
	
}
