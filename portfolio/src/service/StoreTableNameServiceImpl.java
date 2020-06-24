package service;

import dao.StoreTableNameDao;

public class StoreTableNameServiceImpl implements StoreTableNameService {
	private StoreTableNameDao storeTableNameDao;
	
	private StoreTableNameServiceImpl() {
		//Dao 인스턴스를 생성
		storeTableNameDao = StoreTableNameDao.sharedInstance();
	}
	
	private static StoreTableNameService storeTableNameService;
	
	public static StoreTableNameService sharedInstance() {
		if(storeTableNameService == null) {
			storeTableNameService = new StoreTableNameServiceImpl();
		}
		return storeTableNameService;
	}

}
