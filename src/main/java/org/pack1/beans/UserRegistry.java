package org.pack1.beans;

public class UserRegistry {
	
private String username , password;
	
	public UserRegistry(String username, String password) {
		this.username = username;
		this.password = password;

}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}





}

