package com.neuedu.model.bean;

import java.sql.Date;

public class Voterecord {

	private int vid;
	private int nid;
	private int uid;
	private Date votetime;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
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
	public Date getVotetime() {
		return votetime;
	}
	public void setVotetime(Date votetime) {
		this.votetime = votetime;
	}
	
}
