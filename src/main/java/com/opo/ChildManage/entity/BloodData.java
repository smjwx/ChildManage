package com.opo.ChildManage.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BloodData {

	public int user_id;
	public Date time;
	public String blood;
	
	public BloodData() {
		super();
	}

	public BloodData(int user_id, Date time, String blood) {
		super();
		this.user_id = user_id;
		this.time = time;
		this.blood = blood;
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

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}
	
	
	
	
}
