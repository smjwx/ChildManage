package com.opo.ChildManage.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Msg extends Info {

	public int user_id;
	public String water;
	public String active;
	public String location;
	public String voice;
	public String sleep;
	public int bed_t;
	public String blood;
	public String heart;
	public int sleep_t;
	public Date time;
	
	
	public Msg() {
		super();
	}
	
	public Msg(String infoText, int infoCode) {
		super(infoText, infoCode);
	}

	public Msg(int user_id, String water, String active, String location, String voice, String sleep, int bed_t,
			String blood, String heart, int sleep_t, Date time) {
		super();
		this.user_id = user_id;
		this.water = water;
		this.active = active;
		this.location = location;
		this.voice = voice;
		this.sleep = sleep;
		this.bed_t = bed_t;
		this.blood = blood;
		this.heart = heart;
		this.sleep_t = sleep_t;
		this.time = time;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public String getSleep() {
		return sleep;
	}

	public void setSleep(String sleep) {
		this.sleep = sleep;
	}

	public int getBed_t() {
		return bed_t;
	}

	public void setBed_t(int bed_t) {
		this.bed_t = bed_t;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public String getHeart() {
		return heart;
	}

	public void setHeart(String list) {
		this.heart = list;
	}

	public int getSleep_t() {
		return sleep_t;
	}

	public void setSleep_t(int sleep_t) {
		this.sleep_t = sleep_t;
	}

	public String getTime() {
		return new SimpleDateFormat("yyyy.MM.dd HH:mm").format(time);
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
