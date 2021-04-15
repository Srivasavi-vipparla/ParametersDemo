package com.bandiClasses.ParametersDemo.Models;

public class Dog {
	
	private int dogId;
	private String dogname;
	private String dogBreed;
	public int getDogId() {
		return dogId;
	}
	public void setDogId(int dogId) {
		this.dogId = dogId;
	}
	public String getDogname() {
		return dogname;
	}
	public void setDogname(String dogname) {
		this.dogname = dogname;
	}
	public String getDogBreed() {
		return dogBreed;
	}
	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}
	@Override
	public String toString() {
		return "Dog [dogId=" + dogId + ", dogname=" + dogname + ", dogBreed=" + dogBreed + "]";
	}
	

}
