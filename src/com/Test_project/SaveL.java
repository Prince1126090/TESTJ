package com.Test_project;

public class SaveL {
	
	private int id;
	private String name;
	private String address;
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String execute() {
		System.out.println("struts is fine");
		String result=SaveList.SaveL(this);
		return result;

		

	}
	
	
	

}
