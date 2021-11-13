public class Cycle {
    public static void main(String[] args) {
        // Printing numbers from 0 to 20
        for (int i = 0; i < 21; i++) {
            System.out.println(i);
        }

        // Printing all the numbers from -6 to 6 with a step size 2
        int current = -6;
        int last = 6;
        int step = 2;
        while (current <= last) {
            System.out.println(current);
            current += step;
        }

        //Odd numbers sum in a range [10, 20]
        int currentNumber = 10;
        int lastNumber = 20;
        int sum = 0;
        do {
            if (currentNumber % 2 == 1) {
                sum += currentNumber;
            }
            currentNumber += 1;
        } while (currentNumber <= lastNumber);
        System.out.println("Sum of odd numbers: " + sum);
    }
}