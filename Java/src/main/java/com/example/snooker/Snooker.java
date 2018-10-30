package com.example.snooker;

public class Snooker {

	Player player1;
	Player player2;
	Player currentPlayer;
	ShotRecorder shotRecorder;
	
	public Snooker() {
		shotRecorder = new ShotRecorder();
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
	
	// returns the new "current player"
	public String recordMiss(String playerName) {
		if (currentPlayer == player1) {
			currentPlayer = player2;
		} else {
			currentPlayer = player1;
		}
		return currentPlayer.getName();
	}

	// returns the player's new score
	public int recordShot(String playerName, Sink shotResult) {
		if (playerName == player1.getName()) {
			return shotRecorder.recordShot(player1, shotResult);
		}
		else {
			return shotRecorder.recordShot(player2, shotResult);
		}
	}
	
	// returns the score of both players
	public Score getScore() {
		return new Score(player1.getScore(), player2.getScore());
	}
}
