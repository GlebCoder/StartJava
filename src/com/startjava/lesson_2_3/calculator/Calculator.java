package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private static int firstNumber;
    private static String operation;
    private static int secondNumber;

    public Calculator(int firstNumber, String operation, int secondNumber) {
        this.firstNumber = firstNumber;
        this.operation = operation;
        this.secondNumber = secondNumber;
    }

    public static int calculate(int firstNumber, String operation, int secondNumber) {
        int result = 0;
        switch(operation) {
            case "+" :
                result = Math.addExact(firstNumber, secondNumber);
                break;
            case "-" :
                result = Math.subtractExact(firstNumber, secondNumber);
                break;
            case "/" :
                result = firstNumber / secondNumber;
                break;
            case "%" :
                result = firstNumber % secondNumber;
                break;
            case "*" :
                result = Math.multiplyExact(firstNumber, secondNumber);
                break;
            case "^" :
                result = (int) Math.pow(firstNumber, secondNumber);
                break;
        }
        return result;
    }

//    private int power(int firstNumber, int secondNumber) {
//        int result = 1;
//        for(int i = 1; i <= secondNumber; i++) {
//            result *= firstNumber;
//        }
//        return result;
//    }

}