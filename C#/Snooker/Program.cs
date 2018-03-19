using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Snooker
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.WriteLine("Welcome to Snooker.");

                Snooker snooker = new Snooker();

                Console.WriteLine("Please enter player 1 name: ");
                String name1 = Console.ReadLine();
                snooker.addPlayer(name1);

                Console.WriteLine("Please enter player 2 name: ");
                String name2 = Console.ReadLine();
                snooker.addPlayer(name1);

                Console.WriteLine();
                String player = name1;
                bool continuePlaying = true;
                while (continuePlaying)
                {

                    Console.WriteLine("1 = Player missed");
                    Console.WriteLine("2 = Ball sunk");
                    Console.WriteLine("3 = Player quits");
                    Console.WriteLine("Enter the shot result: ");
                    int result = int.Parse(Console.ReadLine());

                    if (result == 1)
                    {
                        player = snooker.recordMiss(player);
                        Console.WriteLine("It’s player " + player + "’s turn.");
                        Console.WriteLine();
                    }
                    else if (result == 2)
                    {
                        Console.WriteLine("1 = red");
                        Console.WriteLine("2 = yellow");
                        Console.WriteLine("3 = green");
                        Console.WriteLine("4 = brown");
                        Console.WriteLine("5 = blue");
                        Console.WriteLine("6 = pink");
                        Console.WriteLine("7 = black");
                        Console.WriteLine("Enter the color of the ball sunk:");
                        int color = int.Parse(Console.ReadLine());
                        Sink shotResult = (Sink)color;
                        int score = snooker.recordShot(player, shotResult);
                        Console.WriteLine("Player " + player + "’s score is now " + score + ".");
                        Console.WriteLine();
                    }
                    else
                    {
                        Score score = snooker.getScore();
                        Console.WriteLine("Final Score is:");
                        Console.WriteLine("Player " + name1 + " score is " + score.Player1Score);
                        Console.WriteLine("Player " + name2 + " score is " + score.Player2Score);
                        Console.WriteLine();
                        continuePlaying = false;
                    }
                }
            }
        }
    }
}
