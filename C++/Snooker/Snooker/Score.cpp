#include "stdafx.h"
#include "Score.h"

namespace Snooker 
{
	Score::Score(int player1Score, int player2Score)
	{
		_player1Score = player1Score;
		_player2Score = player2Score;
	}
	int Score::GetPlayer1Score()
	{
		return _player1Score;
	}
	void Score::SetPlayer1Score(int score)
	{
		_player1Score = score;
	}
	int Score::GetPlayer2Score()
	{
		return _player2Score;
	}
	void Score::SetPlayer2Score(int score)
	{
		_player2Score = score;
	}
}




