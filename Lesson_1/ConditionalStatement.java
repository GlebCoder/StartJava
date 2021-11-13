public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 5;
        if (age > 20) {
            System.out.println("You are older than 20");
        }

        boolean isMale = false;
        if (isMale) {
            System.out.println("You are not a woman");
        }
        if (!isMale) {
            System.out.println("You are not a man");
        }

        double height = 1.75;
        if (height < 1.80) {
            System.out.println("You are not so tall");
        } else {
            System.out.println("You are so tall");
        }

        char firstLetterName = 'G';
        if (firstLetterName == 'M') {
            System.out.println("Your name starts with 'M'");
        } else if (firstLetterName == 'I') {
            System.out.println("Your name starts with 'I'");
        } else {
            System.out.println("Your name does not start with 'M' or 'I'");
        }
    }
} 