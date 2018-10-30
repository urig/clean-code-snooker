// Snooker.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include "Snooker.h"
#include "Sink.h"
#include "Score.h"

using namespace std;

int main()
{
    while (true)
    {
        cout << ("+---------------------+") << endl;
        cout << ("| Welcome to Snooker. |") << endl;
        cout << ("+---------------------+") << endl;

        Snooker::Snooker snooker;

        cout << "Please enter player 1 name: "<<endl;
        string name1;
        cin >> name1;
        snooker.AddPlayer(name1);

        cout << "Please enter player 2 name: "<<endl;
        string name2;
        cin >> name2;
        snooker.AddPlayer(name2);

        cout << endl;
        string player = name1;
        bool continuePlaying = true;
        while (continuePlaying)
        {
            cout << ("Player " + player + " takes the shot:") << endl;
            cout << ("----------------------------------") << endl;
            cout << "  1 = Player missed" << endl;
            cout << "  2 = Ball sunk" << endl;
            cout << "  3 = Player quits" << endl;
            cout << "Enter the shot result: " << endl;
            int result;
            cin >> result;
            cout << endl;

            if (result == 1)
            {
                player = snooker.RecordMiss(player);
                cout << "It's player " << player.c_str() << "'s turn." << endl;
                cout << endl;
            }
            else if (result == 2)
            {
                cout << "  1 = red" << endl;
                cout << "  2 = yellow" << endl;
                cout << "  3 = green" << endl;
                cout << "  4 = brown" << endl;
                cout << "  5 = blue" << endl;
                cout << "  6 = pink" << endl;
                cout << "  7 = black" << endl;
                cout << "Enter the color of the ball sunk:" << endl;
                int color; 
                cin >> color;
                Snooker::Sink shotResult = (Snooker::Sink)color;
                int score = snooker.RecordShot(player, shotResult);
                cout << "Player " << player << "'s score is now " << score + "." << endl;
                cout << endl;
            }
            else
            {
                Snooker::Score* score = snooker.GetScore();
                cout << "Final Score is:" << endl;
                cout << ("===============") << endl;
                cout << "  Player " << name1 << " score is " << score->GetPlayer1Score() << endl;
                cout << "  Player " << name2 << " score is " << score->GetPlayer2Score() << endl;
                cout << endl;
                continuePlaying = false;
            }
        }
    }
    return 0;
}






