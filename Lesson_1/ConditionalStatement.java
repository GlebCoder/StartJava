public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 5;
        boolean isMale = false;
        double height = 1.75;
        char nameFirstLetter = 'G';

        if (age > 20) {
            System.out.println("You are older than 20");
        }
        if (isMale) {
            System.out.println("You are not a woman");
        }
        if (!isMale) {
            System.out.println("You are not a man");
        }
        if (height < 1.80) {
            System.out.println("You are not so tall");
        } else {
            System.out.println("You are so tall");
        }
        if (nameFirstLetter == 'M') {
            System.out.println("Your name starts with 'M'");
        } else if (nameFirstLetter == 'I') {
            System.out.println("Your name starts with 'I'");
        } else {
            System.out.println("Your hame does not start with 'M' or 'I'");
        }
    }
} 