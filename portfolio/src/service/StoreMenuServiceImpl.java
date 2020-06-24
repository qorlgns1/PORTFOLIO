package service;

import dao.StoreMenuDao;

public class StoreMenuServiceImpl implements StoreMenuService {
	private StoreMenuDao storeMenuDao;
	
	private StoreMenuServiceImpl() {
		//Dao 인스턴스를 생성
		storeMenuDao = StoreMenuDao.sharedInstance();
	}
	
	private static StoreMenuService storeMenuService;
	
	public static StoreMenuService sharedInstance() {
		if(storeMenuService == null) {
			storeMenuService = new StoreMenuServiceImpl();
		}
		return storeMenuService;
	}

}
