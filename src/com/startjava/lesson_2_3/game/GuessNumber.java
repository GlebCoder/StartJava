package com.startjava.lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        String player1Name = player1.getName();
        String player2Name = player2.getName();
        boolean isFound = false;
        int hiddenNumber = getHiddenNumber();
        do {
            System.out.println(player1Name + ", enter a number");
            int playerGuess = scanner.nextInt();
            isFound = compare(playerGuess, hiddenNumber);
            if (!isFound) {
                System.out.println(player2Name + ", enter a number");
                playerGuess = scanner.nextInt();
                isFound = compare(playerGuess, hiddenNumber);
            } else {
                System.out.println(player1Name + ", you have found the number!!!");
                return;
            }
        } while (!isFound);
        System.out.println(player2Name + ", you have found the number!!!");
    }

    private boolean compare(int playerGuess, int hiddenNumber) {
        if (playerGuess < hiddenNumber) {
            System.out.println("Your number is too small");
        } else if (playerGuess > hiddenNumber) {
            System.out.println("Your number is too big");
        }
        return playerGuess == hiddenNumber;
    }

    public int getHiddenNumber() {
        Random random = new Random();
        int number = random.nextInt(101);
        if (number > 0) {
            return number;
        } else {
            return 1;
        }
    }
}
