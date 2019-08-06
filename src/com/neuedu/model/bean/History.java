package com.neuedu.model.bean;

import java.sql.Date;

public class History {

	private int hid;
	private int nid;
	private int uid;
	private Date browsetime;
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Date getBrowsetime() {
		return browsetime;
	}
	public void setBrowsetime(Date browsetime) {
		this.browsetime = browsetime;
	}
	
}
