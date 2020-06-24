package domin;

public class StoreTableName {
	private String storetablename;
	private String storenickname;
	
	public StoreTableName() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StoreTableName(String storetablename, String storenickname) {
		super();
		this.storetablename = storetablename;
		this.storenickname = storenickname;
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
		return "storetablename [storetablename=" + storetablename + ", storenickname=" + storenickname + "]";
	}

	
	
	
}
