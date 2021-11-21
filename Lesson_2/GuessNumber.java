import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;
    int computerNumber;

    public static void play(Player player1, Player player2, int computerNumber) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        do {
            System.out.println(player1.getName() + ", enter a number");
            int playerGuess = scanner.nextInt();
            result = compare(playerGuess, computerNumber);
            if (result != 0) {
                System.out.println(player2.getName() + ", enter a number");
                playerGuess = scanner.nextInt();
                result = compare(playerGuess, computerNumber);
            }
        } while (result != 0);
    }

    private static int compare(int playerGuess, int computerNumber) {
        if (playerGuess < computerNumber) {
            System.out.println("Your number is too small");
        } else if (playerGuess > computerNumber) {
            System.out.println("Your number is too big");
        } else {
            System.out.println("You have found the number!!!");
        }
        return playerGuess - computerNumber;
    }
}