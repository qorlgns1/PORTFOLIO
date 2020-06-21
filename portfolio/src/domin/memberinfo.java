package domin;

import java.util.Date;

public class memberinfo {
	private String membernickname;
	private String memberemail;
	private String memberpassword;
	private String memberphonenumber;
	private String memberislogin;
	private Date memberlastlogindate;
	private String memberisremove;
	
	//매개변수가 없는 생성자
	public memberinfo() {
		super();
	}
	
	//매개변수가 있는 생성자
	//이미 데이터가 존재하는 경우 set을 호출하지 않고 
	//한번에 초기화 할 목적으로 생성
	public memberinfo(String membernickname, String memberemail, String memberpassword, String memberphonenumber,
			String memberislogin, Date memberlastlogindate, String memberisremove) {
		super();
		this.membernickname = membernickname;
		this.memberemail = memberemail;
		this.memberpassword = memberpassword;
		this.memberphonenumber = memberphonenumber;
		this.memberislogin = memberislogin;
		this.memberlastlogindate = memberlastlogindate;
		this.memberisremove = memberisremove;
	}
	public String getMembernickname() {
		return membernickname;
	}
	public void setMembernickname(String membernickname) {
		this.membernickname = membernickname;
	}
	public String getMemberemail() {
		return memberemail;
	}
	public void setMemberemail(String memberemail) {
		this.memberemail = memberemail;
	}
	public String getMemberpassword() {
		return memberpassword;
	}
	public void setMemberpassword(String memberpassword) {
		this.memberpassword = memberpassword;
	}
	public String getMemberphonenumber() {
		return memberphonenumber;
	}
	public void setMemberphonenumber(String memberphonenumber) {
		this.memberphonenumber = memberphonenumber;
	}
	public String getMemberislogin() {
		return memberislogin;
	}
	public void setMemberislogin(String memberislogin) {
		this.memberislogin = memberislogin;
	}
	public Date getMemberlastlogindate() {
		return memberlastlogindate;
	}
	public void setMemberlastlogindate(Date memberlastlogindate) {
		this.memberlastlogindate = memberlastlogindate;
	}
	public String getMemberisremove() {
		return memberisremove;
	}
	public void setMemberisremove(String memberisremove) {
		this.memberisremove = memberisremove;
	}
	@Override
	public String toString() {
		return "memberinfo [membernickname=" + membernickname + ", memberemail=" + memberemail + ", memberpassword="
				+ memberpassword + ", memberphonenumber=" + memberphonenumber + ", memberislogin=" + memberislogin
				+ ", memberlastlogindate=" + memberlastlogindate + ", memberisremove=" + memberisremove + "]";
	}
	
	
	
	
	
}
