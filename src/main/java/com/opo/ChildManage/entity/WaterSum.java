package com.opo.ChildManage.entity;

public class WaterSum {

	public int user_id;
	public int water;
//	public String day;
	
	public WaterSum() {
		super();
	}
public WaterSum(int user_id, int water) {
	super();
	this.user_id = user_id;
	this.water = water;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public int getWater() {
	return water;
}
public void setWater(int water) {
	this.water = water;
}
	
	
}
