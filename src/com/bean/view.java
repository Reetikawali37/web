package com.bean;

public class view {

	private int toddlerId;
	private String toddlerName;
	private int toddlerAge;
	private int bsid;
	private String bsName;
	private int bsAge;
	private int bsExperience;
	private String bsType;
	private String bsStatus;
	public int getToddlerId() {
		return toddlerId;
	}
	public void setToddlerId(int toddlerId) {
		this.toddlerId = toddlerId;
	}
	public String getToddlerName() {
		return toddlerName;
	}
	public void setToddlerName(String toddlerName) {
		this.toddlerName = toddlerName;
	}
	public int getToddlerAge() {
		return toddlerAge;
	}
	public void setToddlerAge(int toddlerAge) {
		this.toddlerAge = toddlerAge;
	}
	public int getBsid() {
		return bsid;
	}
	public void setBsid(int bsid) {
		this.bsid = bsid;
	}
	public String getBsName() {
		return bsName;
	}
	public void setBsName(String bsName) {
		this.bsName = bsName;
	}
	public int getBsAge() {
		return bsAge;
	}
	public void setBsAge(int bsAge) {
		this.bsAge = bsAge;
	}
	public int getBsExperience() {
		return bsExperience;
	}
	public void setBsExperience(int bsExperience) {
		this.bsExperience = bsExperience;
	}
	public String getBsType() {
		return bsType;
	}
	public void setBsType(String bsType) {
		this.bsType = bsType;
	}
	public String getBsStatus() {
		return bsStatus;
	}
	public void setBsStatus(String bsStatus) {
		this.bsStatus = bsStatus;
	}
	public view(int toddlerId, String toddlerName, int toddlerAge, int bsid, String bsName, int bsAge, int bsExperience,
			String bsType, String bsStatus) {
		super();
		this.toddlerId = toddlerId;
		this.toddlerName = toddlerName;
		this.toddlerAge = toddlerAge;
		this.bsid = bsid;
		this.bsName = bsName;
		this.bsAge = bsAge;
		this.bsExperience = bsExperience;
		this.bsType = bsType;
		this.bsStatus = bsStatus;
	}
	
	
	
}
