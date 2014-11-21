package com.linkupcrm.linkupcrmcontact.tpihk.objects;

public class MemberAppt {
	private String company;
	private String appointment;
	private int userid;
	
	public MemberAppt(){
		company="-";
		appointment="-";
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAppointment() {
		return appointment;
	}
	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
	
}
