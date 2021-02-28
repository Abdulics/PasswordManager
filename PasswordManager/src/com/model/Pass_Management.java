package com.model;

public class Pass_Management {

	private String web_Url;
	private String web_Username;
	private String web_Password;
	
	public String getWeb_Url() {
		return web_Url;
	}
	public void setWeb_Url(String web_Url) {
		this.web_Url = web_Url;
	}
	public String getWeb_Username() {
		return web_Username;
	}
	public void setWeb_Username(String web_Username) {
		this.web_Username = web_Username;
	}
	public String getWeb_Password() {
		return web_Password;
	}
	public void setWeb_Password(String web_Password) {
		this.web_Password = web_Password;
	}
	
	@Override
	public String toString() {
		return "Pass_Management [web_Url=" + web_Url + ", web_Username=" + web_Username + ", web_Password="
				+ web_Password + "]";
	}
	
	
	
}
