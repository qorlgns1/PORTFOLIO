package service;

import dao.PayInfoDao;

public class PayInfoServiceImpl implements PayInfoService {
	private PayInfoDao payInfoDao;
	
	private PayInfoServiceImpl() {
		//Dao 인스턴스를 생성
		payInfoDao = PayInfoDao.sharedInstance();
	}
	
	private static PayInfoService payInfoService;
	
	public static PayInfoService sharedInstance() {
		if(payInfoService == null) {
			payInfoService = new PayInfoServiceImpl();
		}
		return payInfoService;
	}

}
