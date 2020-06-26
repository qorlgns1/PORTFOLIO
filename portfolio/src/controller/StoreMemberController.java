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
@WebServlet({ "/user/*" })
public class StoreMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//서비스 인스턴스 참조 변수
	private StoreMemberService storeMemberService;
		
	  public StoreMemberController() {
	        super();
	        storeMemberService = StoreMemberServiceImpl.sharedInstance();
	    }
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//공통된 부분을 제거한 주소를 만듭니다.
		String contextPath = request.getContextPath();
		System.out.println("controller.contextPath:" +contextPath);
		String requestURI = request.getRequestURI();
		System.out.println("controller.requestURI:" + requestURI);
		//요청을 맞게 작성했는지 확인
		//완성되면 주석 처리
		//System.out.println("contextPath.length() : " + contextPath.length());
		String command = requestURI.substring(contextPath.length());
		System.out.println("controller.command:" + command);
		String method = request.getMethod();
		System.out.println("controller.method:" + method);
		
		if(command.equals("/user/main")) {
			System.out.println("요청시작");
			RequestDispatcher dispatcher = request.getRequestDispatcher("../member/main.jsp");
			dispatcher.forward(request, response);
			System.out.println("요청끝");
		}
		else if(command.equals("/user/login")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/member/login.jsp");
			dispatcher.forward(request, response);
			
		}
		else if(command.equals("/user/register") && method.equals("GET")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/member/register.jsp");
			dispatcher.forward(request, response);
		}
		else if(command.equals("/user/register") && method.equals("POST")) {
			storeMemberService.insert(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/member/registerresult.jsp");
			dispatcher.forward(request, response);
		}
		else if(command.equals("/user/emailcheck")) {
			storeMemberService.emailCheck(request, response);
			//System.out.println("userService.emailCheck.request : " + request);
			//System.out.println("userService.emailCheck.response : " + response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../member/emailcheck.jsp");
			dispatcher.forward(request, response);
			
		}
		else if(command.equals("/user/nicknamecheck")) {
			storeMemberService.nicknameCheck(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../member/nicknamecheck.jsp");
			dispatcher.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
