package service;

import dao.StoreMemberDao;

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
	
	
	
	
	
	
	
	
	
}
