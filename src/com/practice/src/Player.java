package com.practice.src;


public class Player {
	int id;
	String name;
	int currPos;
	public int getId() {
		return id;
	}
	public Player(int id, String name, int currPos) {
		super();
		this.id = id;
		this.name = name;
		this.currPos = currPos;
	}
	public int getCurrPos() {
		return currPos;
	}
	public void setCurrPos(int currPos) {
		this.currPos = currPos;
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
	

}
