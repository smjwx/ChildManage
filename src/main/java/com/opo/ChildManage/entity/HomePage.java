package com.opo.ChildManage.entity;

public class HomePage extends Msg{
	public String name;
	public String url;
	
	public HomePage() {
		super();
	}
	
	public HomePage(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
