package service;

import dao.StoreInfoDao;

public class StoreInfoServiceImpl implements StoreInfoService {
	private StoreInfoDao storeInfoDao;
	
	private StoreInfoServiceImpl() {
		//Dao 인스턴스를 생성
		storeInfoDao = StoreInfoDao.sharedInstance();
	}
	
	private static StoreInfoService storeInfoService;
	
	public static StoreInfoService sharedInstance() {
		if(storeInfoService == null) {
			storeInfoService = new StoreInfoServiceImpl();
		}
		return storeInfoService;
	}

}
