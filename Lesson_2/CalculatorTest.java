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

            System.out.println("Would you like to continue? 'yes or no':");
            scanner.nextLine();
            answer = scanner.nextLine();
        } while(answer.equals("yes"));
    }
}