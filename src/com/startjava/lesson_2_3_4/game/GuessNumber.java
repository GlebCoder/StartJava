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
        Scanner scanner = new Scanner(System.in);
        String player1Name = player1.getName();
        String player2Name = player2.getName();
        boolean isFound = false;
        int hiddenNumber = getHiddenNumber();
        int count = 0;

        // The "flag" variable is used to show different numbers of attempts if the first player
        // has found the hidden number.
        int flag = 0;
        System.out.println("Dear players you have 10 attempts only to find the number!");
        do {
            System.out.println(player1Name + ", enter a number");
            int playerGuess = scanner.nextInt();
            player1.setAttempt(count, playerGuess);
            isFound = compare(playerGuess, hiddenNumber);
            if (!isFound && count == 9) {
                System.out.println(player1Name + ", you have used all your attempts");
            }
            if (!isFound) {
                System.out.println(player2Name + ", enter a number");
                playerGuess = scanner.nextInt();
                player2.setAttempt(count, playerGuess);
                isFound = compare(playerGuess, hiddenNumber);
                if(!isFound && count == 9) {
                    System.out.println(player2Name + ", you have used all your attempts");
                } else if (isFound) {
                    System.out.println(player2Name + ", you have found the number with " + (count + 1) + " attempts!!!");
                    break;
                }
            } else {
                flag = 1;
                System.out.println(player1Name + ", you have found the number with " + (count + 1) + " attempts!!!");
                break;
            }
            count++;
        } while (!isFound && count < 10);

        int[] player1Attempts = player1.getAttempts(count);
        player1.printAttempts(player1Attempts);
        int[] player2Attempts = player2.getAttempts(count - flag);
        player2.printAttempts(player2Attempts);

        player1.clearAttempts();
        player2.clearAttempts();
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
