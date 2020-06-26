package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domin.StoreMember;



public class StoreMemberDao extends AbstractDao{
	//데이터베이스 연동에 필요한 변수
//		private Connection con;
//		private PreparedStatement pstmt;
//		private ResultSet rs;
		
		// 생성자 - 데이터베이스 드라이버 클래스 로드
		// 한번만 수행하면 되기 때문에 생성자에 작성
		private StoreMemberDao() {
//			try {
//				// mysql 드라이버 로드
//				Class.forName("com.mysql.jdbc.Driver");
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//					e.printStackTrace();
//				}
			}

		private static StoreMemberDao storeMemberDao;
		public static StoreMemberDao sharedInstance() {
			if(storeMemberDao==null) {
				storeMemberDao = new StoreMemberDao();
			}
			return storeMemberDao;
		}
				
		//전체 데이터를 조회하는 메소드
//		public List<StoreMember> list() {
//			//List를 리턴할 때는 null이 리턴될 수 없도록 만들어야 합니다.
//			//반복문에 바로 사용했을 때 NullPointerException이 발생하지 않음
//			//데이터가 없는 경우의 구분은 size가 0인지 확인
//			
//			List<StoreMember> list = new ArrayList<StoreMember>();
//			connect();
//			//예외처리를 하지 않아도 되는 구문이더라도 개발을 할 때는 하는것이 좋습니다.
//			//예외가 발생했을 때 발생한 지점이나 오류를 빨리 해석할 수 있기 때문입니다.
//			try {
//				//SQL을 작성 - 입력받는 데이터는 ?로 작성
//				pstmt = con.prepareStatement("select * from memberinfo");
//				
//				//필요한 파라미터 매핑 - ?가 있으면 매핑
//				
//				//SQL 실행
//				rs = pstmt.executeQuery();
//				//결과 사용
//				//여러 행이 리턴되면 while - 1개의 행이 리턴되면 if
//				//이 작업도 프레임워크를 사용하면 하지 않음
//				while(rs.next()) {
//					//List의 1개의 행 객체 생성
//					StoreMember memberinfo = new StoreMember();
//					//값 채워 넣기
//					memberinfo.setMembernickname(rs.getString("membernickname"));
//					memberinfo.setMemberemail(rs.getString("memberemail"));
//					memberinfo.setMemberpassword(rs.getString("memberpassword"));
//					memberinfo.setMemberphonenumber(rs.getString("memberphonenumber"));
//
//				}
//				
//			}catch(Exception e) {
//				System.out.println(e.getMessage());
//				e.printStackTrace();
//			}
//			
//			
//			
//			close();
//			return list;
//		}
		
		public int insert(StoreMember storeMember) {
			//-1로 초기화해서 -1이 리턴되면 작업 실패
			int result = -1;
			connect();
			try {
				//SQL을 생성
				pstmt = con.prepareStatement("insert into storemembertbl(membernickname, memberemail, memberpassword, memberphonenumber) values(?,?,?,?)");
				//?에 값을 바인딩
				pstmt.setString(1, storeMember.getMembernickname());
				pstmt.setString(2, storeMember.getMemberemail());
				pstmt.setString(3, storeMember.getMemberpassword());
				pstmt.setString(4, storeMember.getMemberphonenumber());
				
				//SQL을 실행
				result = pstmt.executeUpdate();
				
				
			}catch(Exception e) {
				System.out.println("StoreMemberDao.insert 오류");
				System.out.println(e.getMessage());
				e.printStackTrace();
				
			}
			close();
			return result;
			
		}
		
		public boolean emailCheck(String memberemail) {
			System.out.println("userDAO.email: " + memberemail);
			boolean result = false;
			connect();
			try {
				pstmt = con.prepareStatement("select memberemail from storemembertbl where upper(memberemail)=?");
				//데이터 바인딩
				pstmt.setString(1, memberemail.toUpperCase());
				//SQL 실행
				rs= pstmt.executeQuery();
				//여기 부분은 본인이 결정
				//데이터가 만약 있다면 false를 리턴하기로 내가 정하고
				//데이터가 만약 없다면 true를 리턴하기로 정해보자.
				if(rs.next()) {
					result = false;
				}else {
					result = true;
				}
			}catch(Exception e) {
				System.out.println("DAO클래스 email 중복 검사 실패");
				System.out.println("DAO : " + e.getMessage());
				e.printStackTrace();
			}
			
			close();
			System.out.println("UserDAO 리턴값: " + result);
			return result;
				
		}
		
		//nickname 중복 검사를 위한 메소드
			public boolean nicknameCheck(String membernickname) {
				boolean result = false;
				connect();
				try {
					pstmt = con.prepareStatement("select membernickname from storemembertbl where upper(membernickname)=?");
					//데이터 바인딩
					pstmt.setString(1, membernickname.toUpperCase());
					//SQL 실행
					rs= pstmt.executeQuery();
					//여기 부분은 본인이 결정
					//데이터가 만약 있다면 false를 리턴하기로 내가 정하고
					//데이터가 만약 없다면 true를 리턴하기로 정해보자.
					if(rs.next()) {
						result = false;
					}else {
						result = true;
					}
				}catch(Exception e) {
					System.out.println("DAO클래스 nickname 중복 검사 실패");
					System.out.println("DAO : " + e.getMessage());
					e.printStackTrace();
				}
				
				close();
				return result;
						
			}
		
		
		
	}