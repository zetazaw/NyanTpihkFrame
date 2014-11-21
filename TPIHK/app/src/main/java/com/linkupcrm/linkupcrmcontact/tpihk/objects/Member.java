package com.linkupcrm.linkupcrmcontact.tpihk.objects;

import android.os.Parcel;
import android.os.Parcelable;

public class Member implements Parcelable{
	private int userid;
	private String address;
	private String appointmentid;
	private String apptdeptid;
	private String apptName;
	private String companyid;
	private String companyname;
	private String dob;
	private String departmentid;
	private String deptname;
	private String email;
	private String fullname;
	private String othername;
	private String userapptdeptID;
	private String mobilenumber;
	private String officenumber;
	private String imagecontact;
	private String gender;
	private String referral;
	private String joinDate;
	private String creationDate;
	
	public Member() {
		setUserid(0);
		setAddress("-");
		setAppointmentid("-");
		setApptdeptid("-");
		setApptName("-");
		setCompanyid("-");
		setCompanyname("-");
		setDob("-");
		setDepartmentid("-");
		setDeptname("-");
		setEmail("-");
		setFullname("-");
		setOthername("-");
		setUserapptdeptID("-");
		setMobilenumber("-");
		setOfficenumber("-");
		setImagecontact("");
		setGender("");
		setReferral("");
		setJoinDate("");
		setCreationDate("");
	}
	
	public Member(Parcel in){
		setUserid(in.readInt());
		setAddress(in.readString());
		setAppointmentid(in.readString());
		setApptdeptid(in.readString());
		setApptName(in.readString());
		setCompanyid(in.readString());
		setCompanyname(in.readString());
		setDob(in.readString());
		setDepartmentid(in.readString());
		setDeptname(in.readString());
		setEmail(in.readString());
		setFullname(in.readString());
		setOthername(in.readString());
		setUserapptdeptID(in.readString());
		setMobilenumber(in.readString());
		setOfficenumber(in.readString());
		setImagecontact(in.readString());
		setGender(in.readString());
		setReferral(in.readString());
		setJoinDate(in.readString());
		setCreationDate(in.readString());
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getAppointmentid() {
		return appointmentid;
	}

	public void setAppointmentid(String appointmentid) {
		this.appointmentid = appointmentid;
	}

	public String getApptdeptid() {
		return apptdeptid;
	}

	public void setApptdeptid(String apptdeptid) {
		this.apptdeptid = apptdeptid;
	}

	public String getApptName() {
		return apptName;
	}

	public void setApptName(String apptName) {
		this.apptName = apptName;
	}

	public String getCompanyid() {
		return companyid;
	}

	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(String departmentid) {
		this.departmentid = departmentid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getOthername() {
		return othername;
	}

	public void setOthername(String othername) {
		this.othername = othername;
	}

	public String getUserapptdeptID() {
		return userapptdeptID;
	}

	public void setUserapptdeptID(String userapptdeptID) {
		this.userapptdeptID = userapptdeptID;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getOfficenumber() {
		return officenumber;
	}

	public void setOfficenumber(String officenumber) {
		this.officenumber = officenumber;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flag) {
		dest.writeInt(this.userid);
		dest.writeString(this.address);
		dest.writeString(this.appointmentid);
		dest.writeString(this.apptdeptid);
		dest.writeString(this.apptName);
		dest.writeString(this.companyid);
		dest.writeString(this.companyname);
		dest.writeString(this.dob);
		dest.writeString(this.departmentid);
		dest.writeString(this.deptname);
		dest.writeString(this.email);
		dest.writeString(this.fullname);
		dest.writeString(this.othername);
		dest.writeString(this.userapptdeptID);
		dest.writeString(this.mobilenumber);
		dest.writeString(this.officenumber);
		dest.writeString(this.imagecontact);
		dest.writeString(this.gender);
		dest.writeString(this.referral);
		dest.writeString(this.joinDate);
		dest.writeString(this.creationDate);
		
	}
	
	public String getImagecontact() {
		return imagecontact;
	}

	public void setImagecontact(String imagecontact) {
		this.imagecontact = imagecontact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getReferral() {
		return referral;
	}

	public void setReferral(String referral) {
		this.referral = referral;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public static final Creator<Member> CREATOR=new Creator<Member>() {
		
		@Override
		public Member[] newArray(int size) {
			return new Member[size];
		}
		
		@Override
		public Member createFromParcel(Parcel source) {
			return new Member(source);
		}
	};
}
