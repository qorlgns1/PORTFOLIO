package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.StoreMemberService;
import service.StoreMemberServiceImpl;

//${pageContext.request.contextPath}
@WebServlet({ "/memberinfo/*" })
public class MemberInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//서비스 인스턴스 참조 변수
	private StoreMemberService memberInfoService;
		
	  public MemberInfoController() {
	        super();
	        memberInfoService = StoreMemberServiceImpl.sharedInstance();
	    }
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//공통된 부분을 제거한 주소를 만듭니다.
		String contextPath = request.getContextPath();
		String requestURI = request.getRequestURI();
		String command = requestURI.substring(contextPath.length());
		//전송 방식을 저장
		String method = request.getMethod();
		
		if(command.equals("/")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
