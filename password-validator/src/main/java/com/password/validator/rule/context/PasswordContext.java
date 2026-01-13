package com.password.validator.rule.context;

public class PasswordContext {
	private String username;
	private String  email;
	public PasswordContext(String userName, String email) {
		this.username = userName;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
