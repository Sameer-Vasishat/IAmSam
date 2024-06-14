package com.practice.src;

public class Dice {
	int start;
	int end;
	int numberOfDices;
	
	public Dice(int start, int end, int numberOfDices) {
		super();
		this.start = start;
		this.end = end;
		this.numberOfDices = numberOfDices;
	}
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}

	public int getNumberOfDices() {
		return numberOfDices;
	}
	public void setNumberOfDices(int numberOfDices) {
		this.numberOfDices = numberOfDices;
	}
	public int rollDice(Dice dice) {
		return (int) (Math.random()*(dice.getNumberOfDices()*(end-start+1))+1);
	}
}
