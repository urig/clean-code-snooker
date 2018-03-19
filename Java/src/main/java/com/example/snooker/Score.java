package com.example.snooker;

public class Score {

	private int player1Score;
	private int player2Score;
	
	public Score(int player1Score, int player2Score) {
		super();
		this.player1Score = player1Score;
		this.player2Score = player2Score;
	}
	
	public int getPlayer1Score() {
		return player1Score;
	}
	public void setPlayer1Score(int player1Score) {
		this.player1Score = player1Score;
	}
	public int getPlayer2Score() {
		return player2Score;
	}
	public void setPlayer2Score(int player2Score) {
		this.player2Score = player2Score;
	}
}
