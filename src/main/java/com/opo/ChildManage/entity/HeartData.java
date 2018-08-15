package com.opo.ChildManage.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class HeartData {
	public int user_id;
	public Date time;
	public String heart;
	
	public HeartData() {
		super();
	}

	public HeartData(int user_id, Date time, String heart) {
		super();
		this.user_id = user_id;
		this.time = time;
		this.heart = heart;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getTime() {
		return new SimpleDateFormat("HH").format(time);
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getHeart() {
		return heart;
	}

	public void setHeart(String heart) {
		this.heart = heart;
	}

	
}
