package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[11];
    private int count = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts(int count) {
        return Arrays.copyOf(attempts, count);
    }

    public void setAttempt(int index, int playerGuess) {
        attempts[index] = playerGuess;
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void clearAttempts() {
        Arrays.fill(attempts, 0, count + 1, 0 );
    }


}