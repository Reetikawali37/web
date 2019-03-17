package com.bean;

public class Toddler {
private int toddlerId;
private String toddlerName;
private int toddlerAge;
private int bsid;

public Toddler() {
	super();
}
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
public Toddler(int toddlerId, String toddlerName, int toddlerAge) {
	super();
	this.toddlerId = toddlerId;
	this.toddlerName = toddlerName;
	this.toddlerAge = toddlerAge;
}

}
