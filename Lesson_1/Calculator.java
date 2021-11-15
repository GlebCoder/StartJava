import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the first positive integer number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Please, enter an operation sign. It can be: '+', '-', '/', '%', '^', '*'");
        String operation = scanner.next();

        System.out.println("Please, enter the second positive integer number:");
        int secondNumber = scanner.nextInt();

        int result = 0;
        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operation.equals("/")) {
            result = firstNumber / secondNumber;
        } else if (operation.equals("%")) {
            result = firstNumber % secondNumber;
        } else if (operation.equals("^")) {
            result = 1;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
        } else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        }
        System.out.println("The operation result: " + result);
    }
}