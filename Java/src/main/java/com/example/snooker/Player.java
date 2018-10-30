package com.example.snooker;

public class Player {

	private String name;
	private int score;
	
	public Player() {
		name = null;
		score = 0;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
