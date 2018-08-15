package com.opo.ChildManage.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepData {

	public int user_id;
	public Date time;
	public int sleep_t;
	
	public SleepData() {
		super();
	}

	public SleepData(int user_id, Date time, int sleep_t) {
		super();
		this.user_id = user_id;
		this.time = time;
		this.sleep_t = sleep_t;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getTime() {
		return new SimpleDateFormat("dd").format(time);
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getSleep_t() {
		return sleep_t;
	}

	public void setSleep_t(int sleep_t) {
		this.sleep_t = sleep_t;
	}
	
	
}
