package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int randomNumber = 23;
        int guessNumber = 0;

        while (guessNumber != randomNumber) {
            guessNumber = (min + max) / 2;
            System.out.println("My guess is " + guessNumber);
            if (guessNumber < randomNumber) {
                System.out.println("Your number is too small");
                min = guessNumber;
            } else if (guessNumber > randomNumber) {
                System.out.println("Your number is too big");
                max = guessNumber;
            }
        }
        System.out.println("Congratulations!!! You have found the right answer!");
    }
}