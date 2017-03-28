package com.jrw.controller;

public class Team {
	private String abbreviation;
	private String city;
	private String name;
	private String primaryColor;
	private String secondaryColor;

	public String getAbbreviation() {
		return abbreviation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrimaryColor() {
		return primaryColor;
	}
	
	public void setPrimaryColor(String primaryColor){
		this.primaryColor = primaryColor;
	}

	public String getsecondaryColor() {
		return secondaryColor;
	}
	
	public void setSecondaryColor(String secondaryColor){
		this.secondaryColor = secondaryColor;
	}
}
