package com.example.snooker;

import java.io.IOException;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("+---------------------+");
			System.out.println("| Welcome to Snooker. |");
			System.out.println("+---------------------+");
			
			Snooker snooker = new Snooker();
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Please enter player 1 name: "); 
			String name1 = scanner.nextLine();
			snooker.addPlayer(name1);
			
			System.out.print("Please enter player 2 name: ");
			String name2 = scanner.nextLine();
			snooker.addPlayer(name2);
			
			System.out.println();
			String player = name1;
			boolean continuePlaying = true;
			while (continuePlaying) {
			
				System.out.println("Player " + player + " takes the shot:");
				System.out.println("----------------------------------");
				System.out.println("  1 = Player missed");
				System.out.println("  2 = Ball sunk");
				System.out.println("  3 = Player quits");
				System.out.print("Enter the shot result: ");
				int result = scanner.nextInt();
				System.out.println();
				
				if (result == 1) {
					player = snooker.recordMiss(player);
					System.out.println("It’s player " + player + "’s turn.");
					System.out.println();
				} else if (result == 2) {
					System.out.println("  1 = red");
					System.out.println("  2 = yellow");
					System.out.println("  3 = green");
					System.out.println("  4 = brown");
					System.out.println("  5 = blue");
					System.out.println("  6 = pink");
					System.out.println("  7 = black");
					System.out.print("Enter the color of the ball sunk:");
					int color = scanner.nextInt();
					Sink shotResult = Sink.values()[color];
					int score = snooker.recordShot(player, shotResult);
					System.out.println("Player " + player + "’s score is now " + score + ".");
					System.out.println();
				} else {
					Score score = snooker.getScore();
					System.out.println();
					System.out.println("Final Score is:");
					System.out.println("===============");
					System.out.println("  Player " + name1 + " score is " + score.getPlayer1Score());
					System.out.println("  Player " + name2 + " score is " + score.getPlayer2Score());
					System.out.println();
					continuePlaying = false;
				}
			}
		}
	}
}
