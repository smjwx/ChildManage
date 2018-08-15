package com.opo.ChildManage.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WaterWarn {

	@Override
	public String toString() {
		return "WaterWarn [user_id=" + user_id + ", time=" + time + ", water_warn=" + water_warn + "]";
	}

	public int user_id;
	public Date time;
	public String water_warn;
	
	public WaterWarn() {
		super();
	}

	public WaterWarn(int user_id, Date time, String water_warn) {
		super();
		this.user_id = user_id;
		this.time = time;
		this.water_warn = water_warn;
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

	public String getWater_warn() {
		return water_warn;
	}

	public void setWater_warn(String water_warn) {
		this.water_warn = water_warn;
	}
	
	
}
