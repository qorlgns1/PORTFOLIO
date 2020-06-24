package domin;

import java.util.Date;

public class StoreInfo {
	
	private String storenickname;
	private String storename;
	private String storeCEO;
	private String storeaddress;
	private String storeshopnumber;
	private String storeCEOphonenumber;
	private String storesector;
	private String storeopentime;
	private String storeclosetime;
	private Date storeholiyday;
	private String storeintroduce;
	private int storetablecount;
	private String storeparking;
	private String storebusinessnumber;
	private Date storegrandopening;
	private String storehomepage;
	private String storephoto;
	
	public StoreInfo() {
		super();
		
	}
	
	public StoreInfo(String storenickname, String storename, String storeCEO, String storeaddress,
			String storeshopnumber, String storeCEOphonenumber, String storesector, String storeopentime,
			String storeclosetime, Date storeholiyday, String storeintroduce, int storetablecount, String storeparking,
			String storebusinessnumber, Date storegrandopening, String storehomepage, String storephoto) {
		super();
		this.storenickname = storenickname;
		this.storename = storename;
		this.storeCEO = storeCEO;
		this.storeaddress = storeaddress;
		this.storeshopnumber = storeshopnumber;
		this.storeCEOphonenumber = storeCEOphonenumber;
		this.storesector = storesector;
		this.storeopentime = storeopentime;
		this.storeclosetime = storeclosetime;
		this.storeholiyday = storeholiyday;
		this.storeintroduce = storeintroduce;
		this.storetablecount = storetablecount;
		this.storeparking = storeparking;
		this.storebusinessnumber = storebusinessnumber;
		this.storegrandopening = storegrandopening;
		this.storehomepage = storehomepage;
		this.storephoto = storephoto;
	}
	
	public String getStorenickname() {
		return storenickname;
	}
	public void setStorenickname(String storenickname) {
		this.storenickname = storenickname;
	}
	public String getStorename() {
		return storename;
	}
	public void setStorename(String storename) {
		this.storename = storename;
	}
	public String getStoreCEO() {
		return storeCEO;
	}
	public void setStoreCEO(String storeCEO) {
		this.storeCEO = storeCEO;
	}
	public String getStoreaddress() {
		return storeaddress;
	}
	public void setStoreaddress(String storeaddress) {
		this.storeaddress = storeaddress;
	}
	public String getStoreshopnumber() {
		return storeshopnumber;
	}
	public void setStoreshopnumber(String storeshopnumber) {
		this.storeshopnumber = storeshopnumber;
	}
	public String getStoreCEOphonenumber() {
		return storeCEOphonenumber;
	}
	public void setStoreCEOphonenumber(String storeCEOphonenumber) {
		this.storeCEOphonenumber = storeCEOphonenumber;
	}
	public String getStoresector() {
		return storesector;
	}
	public void setStoresector(String storesector) {
		this.storesector = storesector;
	}
	public String getStoreopentime() {
		return storeopentime;
	}
	public void setStoreopentime(String storeopentime) {
		this.storeopentime = storeopentime;
	}
	public String getStoreclosetime() {
		return storeclosetime;
	}
	public void setStoreclosetime(String storeclosetime) {
		this.storeclosetime = storeclosetime;
	}
	public Date getStoreholiyday() {
		return storeholiyday;
	}
	public void setStoreholiyday(Date storeholiyday) {
		this.storeholiyday = storeholiyday;
	}
	public String getStoreintroduce() {
		return storeintroduce;
	}
	public void setStoreintroduce(String storeintroduce) {
		this.storeintroduce = storeintroduce;
	}
	public int getStoretablecount() {
		return storetablecount;
	}
	public void setStoretablecount(int storetablecount) {
		this.storetablecount = storetablecount;
	}
	public String getStoreparking() {
		return storeparking;
	}
	public void setStoreparking(String storeparking) {
		this.storeparking = storeparking;
	}
	public String getStorebusinessnumber() {
		return storebusinessnumber;
	}
	public void setStorebusinessnumber(String storebusinessnumber) {
		this.storebusinessnumber = storebusinessnumber;
	}
	public Date getStoregrandopening() {
		return storegrandopening;
	}
	public void setStoregrandopening(Date storegrandopening) {
		this.storegrandopening = storegrandopening;
	}
	public String getStorehomepage() {
		return storehomepage;
	}
	public void setStorehomepage(String storehomepage) {
		this.storehomepage = storehomepage;
	}
	public String getStorephoto() {
		return storephoto;
	}
	public void setStorephoto(String storephoto) {
		this.storephoto = storephoto;
	}
	
	@Override
	public String toString() {
		return "StoreInfo [storenickname=" + storenickname + ", storename=" + storename + ", storeCEO=" + storeCEO
				+ ", storeaddress=" + storeaddress + ", storeshopnumber=" + storeshopnumber + ", storeCEOphonenumber="
				+ storeCEOphonenumber + ", storesector=" + storesector + ", storeopentime=" + storeopentime
				+ ", storeclosetime=" + storeclosetime + ", storeholiyday=" + storeholiyday + ", storeintroduce="
				+ storeintroduce + ", storetablecount=" + storetablecount + ", storeparking=" + storeparking
				+ ", storebusinessnumber=" + storebusinessnumber + ", storegrandopening=" + storegrandopening
				+ ", storehomepage=" + storehomepage + ", storephoto=" + storephoto + "]";
	}
	
	
}
