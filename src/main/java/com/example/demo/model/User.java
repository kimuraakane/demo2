package com.example.demo.model;

public class User {
	private String name;
	private String email;
	private String tel;
	
	//コンストラクタ
	public User() {
	}
	
	//ゲッターとセッター
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
}
