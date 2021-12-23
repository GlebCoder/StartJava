package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        int firstNumber;
        int secondNumber;
        String operation;
        do {
            System.out.println("Enter math expression in a format '1 + 2': ");
            String expression = scanner.nextLine();
            String[] elements = expression.split(" ");
            firstNumber = Integer.parseInt(elements[0]);
            operation = elements[1];
            secondNumber = Integer.parseInt(elements[2]);

            int result = Calculator.calculate(firstNumber, operation, secondNumber);
            System.out.println("The result is " + result);

            do {
                System.out.println("Would you like to continue? [yes/no]:");
                answer = scanner.nextLine();
            } while(!(answer.equals("yes") || answer.equals("no")));
        } while(answer.equals("yes"));
    }
}