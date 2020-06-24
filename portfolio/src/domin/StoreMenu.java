package domin;

import java.util.Date;

public class StoreMenu {
	private String menucode;
	private String menuname;
	private String menuinfo;
	private int menuprice;
	private String menuphoto;
	private String storenickname;
	public StoreMenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StoreMenu(String menucode, String menuname, String menuinfo, int menuprice, String menuphoto,
			String storenickname) {
		super();
		this.menucode = menucode;
		this.menuname = menuname;
		this.menuinfo = menuinfo;
		this.menuprice = menuprice;
		this.menuphoto = menuphoto;
		this.storenickname = storenickname;
	}
	public String getMenucode() {
		return menucode;
	}
	public void setMenucode(String menucode) {
		this.menucode = menucode;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public String getMenuinfo() {
		return menuinfo;
	}
	public void setMenuinfo(String menuinfo) {
		this.menuinfo = menuinfo;
	}
	public int getMenuprice() {
		return menuprice;
	}
	public void setMenuprice(int menuprice) {
		this.menuprice = menuprice;
	}
	public String getMenuphoto() {
		return menuphoto;
	}
	public void setMenuphoto(String menuphoto) {
		this.menuphoto = menuphoto;
	}
	public String getStorenickname() {
		return storenickname;
	}
	public void setStorenickname(String storenickname) {
		this.storenickname = storenickname;
	}
	@Override
	public String toString() {
		return "StoreMenu [menucode=" + menucode + ", menuname=" + menuname + ", menuinfo=" + menuinfo + ", menuprice="
				+ menuprice + ", menuphoto=" + menuphoto + ", storenickname=" + storenickname + "]";
	}

	
	
}
