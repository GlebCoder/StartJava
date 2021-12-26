package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];
    private int count;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, count);
    }

    public void setAttempt(int playerGuess) {
        attempts[count] = playerGuess;
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void clearAttempts() {
        if (count < 10) {
            Arrays.fill(attempts, 0, count + 1, 0);
        } else {
            Arrays.fill(attempts, 0);
        }
    }
}