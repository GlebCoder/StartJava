import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a name for the first player");
        String player1Name = scanner.next();
        Player player1 = new Player(player1Name);

        System.out.println("Please, enter a name for the second player");
        String player2Name = scanner.next();
        Player player2 = new Player(player2Name);

        String answer;
        do {
            int computerNumber = generateInteger();
            GuessNumber.play(player1, player2, computerNumber);
            do {
                System.out.println("Would you like to play again? [yes/no]");
                answer = scanner.next();
            } while (!(answer.toLowerCase().equals("yes")) && !(answer.toLowerCase().equals("no")));
        } while (answer.equals("yes"));
    }

    public static int generateInteger() {
        Random random = new Random();
        int number = random.nextInt(101);
        if (number > 0) {
            return number;
        } else {
            return 1;
        }
    }
}