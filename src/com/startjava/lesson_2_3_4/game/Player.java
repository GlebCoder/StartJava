package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts(int count) {
        return Arrays.copyOf(attempts, count+1);
    }

    public void setAttempt(int index, int playerGuess) {
        attempts[index] = playerGuess;
    }

    public void printAttempts(int[] attempts) {
        System.out.print(name + ", your attempts were: ");
        System.out.println(Arrays.toString(attempts));
    }

    public void clearAttempts() {
        Arrays.fill(attempts, 0);
    }
}