package com.startjava.lesson_2_3_4.game;

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
        boolean isFound = false;
        int hiddenNumber = getHiddenNumber();
        int count = 0;

        System.out.println("Dear players you have 10 attempts only to find the number!");
        do {
            int playerGuess = makeGuess(player1);
            isFound = compare(playerGuess, hiddenNumber);
            if (isFound) {
                System.out.println(player1.getName() + ", you have found the number with " + (count + 1) + " attempts!!!");
                break;
            }
            compareCountAttempts(player1);

            playerGuess = makeGuess(player2);
            isFound = compare(playerGuess, hiddenNumber);
            if (isFound) {
                System.out.println(player2.getName() + ", you have found the number with " + (count + 1) + " attempts!!!");
                break;
            }
            compareCountAttempts(player2);
            count++;
        } while (count < 10);

        printAttempts(player1);
        printAttempts(player2);

        player1.clearAttempts();
        player2.clearAttempts();
    }

    private int getHiddenNumber() {
        Random random = new Random();
        return 1 + random.nextInt(100);
    }

    private int makeGuess(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + ", enter a number");
        int playerGuess = scanner.nextInt();
        player.setAttempt(playerGuess);
        return playerGuess;
    }

    private boolean compare(int playerGuess, int hiddenNumber) {
        if (playerGuess < hiddenNumber) {
            System.out.println("Your number is too small");
        } else if (playerGuess > hiddenNumber) {
            System.out.println("Your number is too big");
        }
        return playerGuess == hiddenNumber;
    }

    private void compareCountAttempts(Player player) {
        if (player.getCount() == 10) {
            System.out.println(player.getName() + ", you have used all your attempts!");
        }
    }

    private void printAttempts(Player player) {
        int[] attempts = player.getAttempts();
        System.out.print(player.getName() + ", your attempts were: ");
        for (int attempt : attempts) {
            System.out.print(attempt + " ");
        }
        System.out.println("");
    }
}
