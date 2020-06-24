package service;

import dao.MemberPointDao;

public class MemberPointServiceImpl implements MemberPointService {
	private MemberPointDao memberPointDao;
	
	private MemberPointServiceImpl() {
		//Dao 인스턴스를 생성
		memberPointDao = MemberPointDao.sharedInstance();
	}
	
	private static MemberPointService memberPointService;
	
	public static MemberPointService sharedInstance() {
		if(memberPointService == null) {
			memberPointService = new MemberPointServiceImpl();
		}
		return memberPointService;
	}
	
}
