import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do{
            System.out.println("Enter the first number:");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter a math operation sign:");
            scanner.nextLine();
            String operation = scanner.nextLine();

            System.out.println("Enter the second number:");
            int secondNumber = scanner.nextInt();

            Calculator calculator = new Calculator(firstNumber, operation, secondNumber);
            System.out.println("The result is " + calculator.calculate());

            System.out.println("Would you like to continue? 'yes or no':");
            scanner.nextLine();
            answer = scanner.nextLine();
        } while(answer.equals("yes"));
    }
}