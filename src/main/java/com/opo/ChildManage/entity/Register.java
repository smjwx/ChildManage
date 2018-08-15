package com.opo.ChildManage.entity;

public class Register extends Info{

	public static String name;
	public String password;
	public String relation;
	public int age;
	public String url;
	
	public Register() {
		super();
	}

	public Register(String name, String password, String relation, int age, String url) {
		super();
		this.name = name;
		this.password = password;
		this.relation = relation;
		this.age = age;
		this.url = url;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
