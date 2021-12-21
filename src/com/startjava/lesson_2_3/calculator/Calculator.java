package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int firstNumber;
    private String operation;
    private int secondNumber;

    public Calculator(int firstNumber, String operation, int secondNumber) {
        this.firstNumber = firstNumber;
        this.operation = operation;
        this.secondNumber = secondNumber;
    }

    public int calculate() {
        int result = 0;
        switch(operation) {
            case "+" :
                result = firstNumber + secondNumber;
                break;
            case "-" :
                result = firstNumber - secondNumber;
                break;
            case "/" :
                result = firstNumber / secondNumber;
                break;
            case "%" :
                result = firstNumber % secondNumber;
                break;
            case "*" :
                result = firstNumber * secondNumber;
                break;
            case "^" :
                result = power(firstNumber, secondNumber);
                break;
        }
        return result;
    }

    private int power(int firstNumber, int secondNumber) {
        int result = 1;
        for(int i = 1; i <= secondNumber; i++) {
            result *= firstNumber;
        }
        return result;
    }

}