package com.example.snooker;

public class ShotRecorder {
	
	public int recordShot(Player player, Sink shotResult) {
		int newScore;
		newScore = player.getScore() + calculateScore(shotResult);
		player.setScore(newScore);
		return newScore;
	}
	
	private int calculateScore(Sink shotResult) {
		switch(shotResult) {
			case WHITE : return 0;
			case RED : return 1;
			case YELLOW : return 2;
			case GREEN : return 3;
			case BROWN : return 4;
			case BLUE : return 5;
			case PINK : return 6;
			case BLACK : return 7;
		}
		return 0;
	}

}
