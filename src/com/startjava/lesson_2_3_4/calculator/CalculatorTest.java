package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Enter math expression in a format '1 + 2': ");
            String expression = scanner.nextLine();
            int result = Calculator.calculate(expression);
            System.out.println("The result is " + result);

            do {
                System.out.println("Would you like to continue? [yes/no]:");
                answer = scanner.nextLine();
            } while(!(answer.equals("yes") || answer.equals("no")));
        } while(answer.equals("yes"));
    }
}