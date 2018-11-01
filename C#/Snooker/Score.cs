namespace Snooker
{
    public class Score
    {

        public Score(int player1Score, int player2Score)
        {
            Player1Score = player1Score;
            Player2Score = player2Score;
        }

        public int Player1Score { get; set; }

        public int Player2Score { get; set; }
    }
}
