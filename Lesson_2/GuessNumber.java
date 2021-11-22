import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public static void play(GuessNumber game, int hiddenNumber) {
        Scanner scanner = new Scanner(System.in);
        String player1Name = game.getPlayer1().getName();
        String player2Name = game.getPlayer2().getName();
        boolean isFound = false;
        do {
            System.out.println(player1Name + ", enter a number");
            int playerGuess = scanner.nextInt();
            isFound = compare(playerGuess, hiddenNumber);
            if (!isFound) {
                System.out.println(player2Name + ", enter a number");
                playerGuess = scanner.nextInt();
                isFound = compare(playerGuess, hiddenNumber);
            } else {
                System.out.println(player1Name + ", you have found the number!!!");
                return;
            }
        } while (!isFound);
        System.out.println(player2Name + ", you have found the number!!!");
    }

    private static boolean compare(int playerGuess, int computerNumber) {
        if (playerGuess < computerNumber) {
            System.out.println("Your number is too small");
        } else if (playerGuess > computerNumber) {
            System.out.println("Your number is too big");
        }
        return playerGuess == computerNumber;
    }

    public int getHiddenNumber() {
        Random random = new Random();
        int number = random.nextInt(101);
        if (number > 0) {
            return number;
        } else {
            return 1;
        }
    }
}
