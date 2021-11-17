public class Calculator {
    int firstNumber;
    String operation;
    int secondNumber;

    public Calculator(int firstNumber, String operation, int secondNumber) {
        this.firstNumber = firstNumber;
        this.operation = operation;
        this.secondNumber = secondNumber;
    }

    public int calculate() {
        int result = 0;
        if(firstNumber > 0 && secondNumber > 0) {
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
                default:
                    result = -1;
                    System.out.println("Illegal operation. Operation sign can be '+', '-', '/', '*', '%' or '^'");
            }
        } else {
            result = -1;
            System.out.println("Illegal numbers. Numbers have to be positive integers.");

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