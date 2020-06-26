package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import dao.StoreMemberDao;
import domin.StoreMember;

public class StoreMemberServiceImpl implements StoreMemberService {
	
	private StoreMemberDao storeMemberDao;
	private StoreMemberServiceImpl() {
		//Dao 인스턴스를 생성
		storeMemberDao = StoreMemberDao.sharedInstance();
	}
	
	private static StoreMemberService storeMemberService;
	
	public static StoreMemberService sharedInstance() {
		if(storeMemberService == null) {
			storeMemberService = new StoreMemberServiceImpl();
			
		}
		return storeMemberService;
				
	}

	@Override
	public void emailCheck(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			//System.out.println("인코딩 설정");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//1.별도의 작업을 수행해야 하면 처리
		String memberemail = request.getParameter("memberemail");
		//System.out.println("StoreMemberServiceimplGetParameter.memberemail : " + memberemail);
		//2.별도의 작업을 수행해야 하면 처리
		//암호화, 파일 업로드, 파라미터를 다른 자료형으로 변환
		//업무처리에 필요한 알고리즘
		
		//3.DAO 작업이 필요하면 호출할 DAO의 매개변수를 생성
		
		//4.DAO의 메소드를 호출해서 결과를 변수에 저장
		boolean result = storeMemberDao.emailCheck(memberemail);
		//System.out.println("userserviceimpl.result : " + result);
		//5.단순 웹 페이지를 위한 서버의 경우는 결과들을 request 나 session에 저장
		//만약에 REST API 서버의 경우는 JSONObject 클래스의 객체를 만들어서 저장한 후 request에 저장합니다.
		//웹 페이지를 위한 로그인의 경우에만 session에 저장하던지 데이터베이스에 로그인 여부를 저장해 놓습니다.
		JSONObject object = new JSONObject();
		object.put("result", result);
		//System.out.println("userServiceImpl.object : "+object);
		//request에 저장
		request.setAttribute("result", object);
	}
	
	@Override
	public void nicknameCheck(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			//System.out.println("인코딩 설정");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//1.별도의 작업을 수행해야 하면 처리
		String membernickname = request.getParameter("membernickname");
		
		//2.별도의 작업을 수행해야 하면 처리
		//암호화, 파일 업로드, 파라미터를 다른 자료형으로 변환
		//업무처리에 필요한 알고리즘
		
		//3.DAO 작업이 필요하면 호출할 DAO의 매개변수를 생성
		
		boolean result = storeMemberDao.nicknameCheck(membernickname);		
		//5.단순 웹 페이지를 위한 서버의 경우는 결과들을 request 나 session에 저장
		//만약에 REST API 서버의 경우는 JSONObject 클래스의 객체를 만들어서 저장한 후 request에 저장합니다.
		//웹 페이지를 위한 로그인의 경우에만 session에 저장하던지 데이터베이스에 로그인 여부를 저장해 놓습니다.
		JSONObject object = new JSONObject();
		object.put("result", result);
		
		//request에 저장
		request.setAttribute("result", object);
		
	}

	@Override
	public void insert(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			//System.out.println("인코딩 설정");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		String membernickname = request.getParameter("membernickname");
		String memberemail = request.getParameter("memberemail");
		String memberpassword = request.getParameter("memberpassword");
		String memberphonenumber = request.getParameter("memberphonenumber");

		//3.호출할 DAO 메소드의 매개변수를 생성
		StoreMember storeMember = new StoreMember();
		
		storeMember.setMembernickname(membernickname);
		storeMember.setMemberemail(memberemail);
		storeMember.setMemberpassword(memberpassword);
		storeMember.setMemberphonenumber(memberphonenumber);
		
		//4.DAO 메소드를 호출
		int result = storeMemberDao.insert(storeMember);
		
		
		//5.결과를 저장
		JSONObject object = new JSONObject();
		if(result>0) {
			object.put("result", true);
		}else {
			object.put("result", false);
		}
		System.out.println(object);
		request.setAttribute("result", object);
		
		
	}
	
	
	
	
	
	
	
	
	
}
