import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        System.out.println("What is your age?");
        if (scanner.hasNextInt()) {
            age = scanner.nextInt();

            if (age >= 21) {
                System.out.println("You get a wristband!");
            }
        } else {
            System.out.println("That isn't a proper answer.");
            System.exit(0);
        }
    }
}