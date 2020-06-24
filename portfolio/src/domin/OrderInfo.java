package domin;

import java.util.Date;

public class OrderInfo {
	private String ordernumber;
	private String storetablename;
	private String storenickname;
	public OrderInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderInfo(String ordernumber, String storetablename, String storenickname) {
		super();
		this.ordernumber = ordernumber;
		this.storetablename = storetablename;
		this.storenickname = storenickname;
	}
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public String getStoretablename() {
		return storetablename;
	}
	public void setStoretablename(String storetablename) {
		this.storetablename = storetablename;
	}
	public String getStorenickname() {
		return storenickname;
	}
	public void setStorenickname(String storenickname) {
		this.storenickname = storenickname;
	}
	@Override
	public String toString() {
		return "OrderInfo [ordernumber=" + ordernumber + ", storetablename=" + storetablename + ", storenickname="
				+ storenickname + "]";
	}
	
	
}
