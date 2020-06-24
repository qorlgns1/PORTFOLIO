package service;

import dao.OrderInfoDetailsDao;

public class OrderInfoDetailsServiceImpl implements OrderInfoDetailsService {
	private OrderInfoDetailsDao orderInfoDetailsDao;
	
	private OrderInfoDetailsServiceImpl() {
		//Dao 인스턴스를 생성
		orderInfoDetailsDao = OrderInfoDetailsDao.sharedInstance();
	}
	
	private static OrderInfoDetailsService orderInfoDetailsService;
	
	public static OrderInfoDetailsService sharedInstance() {
		if(orderInfoDetailsService == null) {
			orderInfoDetailsService = new OrderInfoDetailsServiceImpl();
		}
		return orderInfoDetailsService;
	}

}
