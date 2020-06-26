package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface StoreMemberService {
	public void emailCheck(HttpServletRequest request, HttpServletResponse response);
	public void nicknameCheck(HttpServletRequest request, HttpServletResponse response);
	public void insert(HttpServletRequest request, HttpServletResponse response);

}
