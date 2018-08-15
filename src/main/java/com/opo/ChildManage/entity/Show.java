package com.opo.ChildManage.entity;

public class Show {

	public int user_id;
	public int bed_t;
	public String blood;
	public String heart;
	public int sleep_t;
//	public String day;
	
	public Show() {
		super();
	}
	
public Show(int user_id, int bed_t, String blood, String heart, int sleep_t) {
	super();
	this.user_id = user_id;
	this.bed_t = bed_t;
	this.blood = blood;
	this.heart = heart;
	this.sleep_t = sleep_t;
}

public int getUser_id() {
	return user_id;
}

public void setUser_id(int user_id) {
	this.user_id = user_id;
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

public void setHeart(String heart) {
	this.heart = heart;
}

public int getSleep_t() {
	return sleep_t;
}

public void setSleep_t(int sleep_t) {
	this.sleep_t = sleep_t;
}
	
}
