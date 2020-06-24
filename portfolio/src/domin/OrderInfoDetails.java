package domin;

import java.util.Date;

public class OrderInfoDetails {
	
	private String ordernumber;
	private String menucode;
	private int menucount;
	private Date orderdate;
	private String orderperson;
	
	public OrderInfoDetails() {
		super();
	}
	
	public OrderInfoDetails(String ordernumber, String menucode, int menucount, Date orderdate, String orderperson) {
		super();
		this.ordernumber = ordernumber;
		this.menucode = menucode;
		this.menucount = menucount;
		this.orderdate = orderdate;
		this.orderperson = orderperson;
	}
	
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public String getMenucode() {
		return menucode;
	}
	public void setMenucode(String menucode) {
		this.menucode = menucode;
	}
	public int getMenucount() {
		return menucount;
	}
	public void setMenucount(int menucount) {
		this.menucount = menucount;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public String getOrderperson() {
		return orderperson;
	}
	public void setOrderperson(String orderperson) {
		this.orderperson = orderperson;
	}
	@Override
	public String toString() {
		return "OrderInfoDetails [ordernumber=" + ordernumber + ", menucode=" + menucode + ", menucount=" + menucount
				+ ", orderdate=" + orderdate + ", orderperson=" + orderperson + "]";
	}

	
}
