package com.opo.ChildManage.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepWarn {

	public int user_id;
	public Date time;
	public String sleep_warn;
	
	public SleepWarn() {
		super();
	}

	public SleepWarn(int user_id, Date time, String sleep_warn) {
		super();
		this.user_id = user_id;
		this.time = time;
		this.sleep_warn = sleep_warn;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getTime() {
		return new SimpleDateFormat("yyyy.MM.dd HH:mm").format(time);
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getSleep_warn() {
		return sleep_warn;
	}

	public void setSleep_warn(String sleep_warn) {
		this.sleep_warn = sleep_warn;
	}
	
	
}
