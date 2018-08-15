package com.opo.ChildManage.entity;

public class Login extends Info {

	public String name;
	public int id;
	public String relation;
	public int age;
	public String url;
	
	public Login() {
		super();
	}
	
	public Login(String infoText, int infoCode) {
		super(infoText, infoCode);
	}

	public Login(String name, int id, String relation, int age, String url) {
		super();
		this.name = name;
		this.id = id;
		this.relation = relation;
		this.age = age;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
