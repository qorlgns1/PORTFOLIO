package service;

import dao.OrderInfoDao;

public class OrderInfoServiceImpl implements OrderInfoService {
	private OrderInfoDao orderInfoDao;
	
	private OrderInfoServiceImpl() {
		//Dao 인스턴스를 생성
		orderInfoDao = OrderInfoDao.sharedInstance();
	}
	
	private static OrderInfoService orderInfoService;
	
	public static OrderInfoService sharedInstance() {
		if(orderInfoService == null) {
			orderInfoService = new OrderInfoServiceImpl();
		}
		return orderInfoService;
	}

}
