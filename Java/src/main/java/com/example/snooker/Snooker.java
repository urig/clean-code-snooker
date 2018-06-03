package com.example.snooker;

public class Snooker {

	Player player1;
	Player player2;
	Player currentPlayer;
	
	public Snooker() {
		player1 = new Player();
		player2 = new Player();
		currentPlayer = player1;
	}
	
	public void addPlayer(String name) {
		if (player1.getName() == null) {
			player1.setName(name);
		} else {
			player2.setName(name);
		}
	}
	
	public String recordMiss(String playerName) {
		if (currentPlayer == player1) {
			currentPlayer = player2;
		} else {
			currentPlayer = player1;
		}
		return currentPlayer.getName();
	}

	public int recordShot(String playerName, Sink shotResult) {
		if (playerName == player1.getName()) {
			return recordShot(player1, shotResult);
		}
		else {
			return recordShot(player2, shotResult);
		}
	}

	private int recordShot(Player player, Sink shotResult) {
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
	
	public Score getScore() {
		return new Score(player1.getScore(), player2.getScore());
	}
}
