package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberPointService;
import service.MemberPointServiceImpl;


@WebServlet("/memberpoint/*")
public class MemberPointController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private MemberPointService memberPointService;
	
    public MemberPointController() {
        super();
        memberPointService = MemberPointServiceImpl.sharedInstance();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		//공통된 부분을 제거한 주소를 만듭니다.
		String contextPath = request.getContextPath();
		//System.out.println("controller.contextPath:" +contextPath);
		String requestURI = request.getRequestURI();
		//System.out.println("controller.requestURI:" + requestURI);
		//요청을 맞게 작성했는지 확인
		//완성되면 주석 처리
		String command = requestURI.substring(contextPath.length());
		//System.out.println("controller.command:" + command);
		String method = request.getMethod();
		//System.out.println("controller.method:" + method);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
