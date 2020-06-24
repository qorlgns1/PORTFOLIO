package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

abstract class AbstractDao {
	//데이터베이스 연동에 필요한 속성 
	protected Connection con; //protected는 상속을 받은 곳에서는 사용이 가능
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	//데이터베이스 연결 메소드
	void connect() {
		try {	
			//DataBase Connection Pool을 이용하는 방식
			//미리 데이터베이스 연결을 만들어두고 사용
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/DBConn");
			con = ds.getConnection();

		}catch(Exception e) {
			System.out.println("접속(connect) 오류");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	void close() {
		try {
			if(rs != null) {
				rs.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(con != null) {
				con.close();
			}
			
		}catch(Exception e) {
			System.out.println("접속 해제(close) 오류");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
