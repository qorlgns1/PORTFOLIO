package domin;

import java.util.Date;

public class MemberPoint {
	private int memberpoint;
	private String storenickname;
	private String membernickname;
	
	public MemberPoint() {
		super();
	}
	
	public MemberPoint(int memberpoint, String storenickname, String membernickname) {
		super();
		this.memberpoint = memberpoint;
		this.storenickname = storenickname;
		this.membernickname = membernickname;
	}
	
	public int getMemberpoint() {
		return memberpoint;
	}
	public void setMemberpoint(int memberpoint) {
		this.memberpoint = memberpoint;
	}
	public String getStorenickname() {
		return storenickname;
	}
	public void setStorenickname(String storenickname) {
		this.storenickname = storenickname;
	}
	public String getMembernickname() {
		return membernickname;
	}
	public void setMembernickname(String membernickname) {
		this.membernickname = membernickname;
	}
	
	@Override
	public String toString() {
		return "MemberPoint [memberpoint=" + memberpoint + ", storenickname=" + storenickname + ", membernickname="
				+ membernickname + "]";
	}
	

}
