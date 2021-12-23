package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String expression) {
        String[] elements = expression.split(" ");
        int firstNumber = Integer.parseInt(elements[0]);
        int secondNumber = Integer.parseInt(elements[2]);
        String operation = elements[1];

        int result = 0;
        switch(operation) {
            case "+" :
                return Math.addExact(firstNumber, secondNumber);
            case "-" :
                return Math.subtractExact(firstNumber, secondNumber);
            case "/" :
                return firstNumber / secondNumber;
            case "%" :
                return firstNumber % secondNumber;
            case "*" :
                return Math.multiplyExact(firstNumber, secondNumber);
            case "^" :
                return (int) Math.pow(firstNumber, secondNumber);
        }
        return result;
    }
}