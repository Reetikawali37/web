package com.bean;

public class Babysitter {
private int bsId;
private String bsName;
private int bsAge;
private int bsExperience;
private String bsType;
private String bsStatus;
public int getBsId() {
	return bsId;
}
public void setBsId(int bsId) {
	this.bsId = bsId;
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
public Babysitter(int bsId, String bsName, int bsAge, int bsExperience, String bsType, String bsStatus) {
	super();
	this.bsId = bsId;
	this.bsName = bsName;
	this.bsAge = bsAge;
	this.bsExperience = bsExperience;
	this.bsType = bsType;
	this.bsStatus = bsStatus;
}

}
