#pragma once
namespace Snooker
{
	class Score
	{
	public:
		Score(int player1Score, int player2Score);

		int GetPlayer1Score();
		void SetPlayer1Score(int score);

		int GetPlayer2Score();
		void SetPlayer2Score(int score);
	private:
		int _player1Score;
		int _player2Score;
	};
}
