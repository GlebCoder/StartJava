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
            do {
                System.out.println("Enter the first number:");
                firstNumber = scanner.nextInt();
            } while(firstNumber <= 0);

            do {
                System.out.println("Enter a math operation sign:");
                operation = scanner.next();
            } while(!(operation.equals("+") 
                    || operation.equals("-")
                    || operation.equals("/")
                    || operation.equals("*")
                    || operation.equals("%")
                    || operation.equals("^")));

            do {
                System.out.println("Enter the second number:");
                secondNumber = scanner.nextInt();
            } while(secondNumber <= 0);

            Calculator calculator = new Calculator(firstNumber, operation, secondNumber);
            System.out.println("The result is " + calculator.calculate());

            do {
                System.out.println("Would you like to continue? [yes/no]:");
                answer = scanner.next();
            } while(!(answer.equals("yes") || answer.equals("no")));
        } while(answer.equals("yes"));
    }
}