package domin;

import java.util.Date;

public class PayInfo {
	
	private String paycode;
	private String ordernumber;
	private String storenickname;
	private Date paytime;
	private int menucount;
	private String paymethod;
	public PayInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PayInfo(String paycode, String ordernumber, String storenickname, Date paytime, int menucount,
			String paymethod) {
		super();
		this.paycode = paycode;
		this.ordernumber = ordernumber;
		this.storenickname = storenickname;
		this.paytime = paytime;
		this.menucount = menucount;
		this.paymethod = paymethod;
	}
	public String getPaycode() {
		return paycode;
	}
	public void setPaycode(String paycode) {
		this.paycode = paycode;
	}
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public String getStorenickname() {
		return storenickname;
	}
	public void setStorenickname(String storenickname) {
		this.storenickname = storenickname;
	}
	public Date getPaytime() {
		return paytime;
	}
	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}
	public int getMenucount() {
		return menucount;
	}
	public void setMenucount(int menucount) {
		this.menucount = menucount;
	}
	public String getPaymethod() {
		return paymethod;
	}
	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}
	@Override
	public String toString() {
		return "PayInfo [paycode=" + paycode + ", ordernumber=" + ordernumber + ", storenickname=" + storenickname
				+ ", paytime=" + paytime + ", menucount=" + menucount + ", paymethod=" + paymethod + "]";
	}
	
	
}
