package service;

import dao.MemberInfoDao;

public class MemberInfoServiceImpl implements MemberInfoService {
	
	private MemberInfoDao memberInfoDao;
	private MemberInfoServiceImpl() {
		//Dao 인스턴스를 생성
		memberInfoDao = MemberInfoDao.sharedInstance();
	}
	
	private static MemberInfoService memberInfoService;
	
	public static MemberInfoService sharedInstance() {
		if(memberInfoService == null) {
			memberInfoService = new MemberInfoServiceImpl();
			
		}
		return memberInfoService;
				
	}
	
	
	
	
	
	
	
	
	
}
