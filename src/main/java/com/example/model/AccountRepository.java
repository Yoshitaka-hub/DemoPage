package com.example.model;

public class AccountRepository {
	private int id;
	private String name;
	private String password;
	private Boolean isOwner;

	public AccountRepository() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public AccountRepository(int id, String name, String password, Boolean isOwner) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.isOwner = isOwner;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
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
	public Boolean getIsOwner() {
		return isOwner;
	}
	public void setIsOwner(Boolean isOwner) {
		this.isOwner = isOwner;
	}

}
