// RUN ME!
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Ignore

        System.out.println("Here you can find loops info:");

        // Loops types
        System.out.println("There are 3 loops types: for, while and do while");

        // For (we know how many iterations we will need)
        System.out.println("How much times you wish to print \"Hello World!\"?");
        int targetIterations = sc.nextInt();
        for (int i = 0; i < targetIterations; i++) {
            System.out.println("Hello World! (" + i + ")");
        }
        System.out.println("We use for loop if we know precisely how much iterations we will need.");

        // While (we don't know how many iterations we will need)
        double randomNumber = Math.random(); // This code chooses a random decimal number between 0 and 1.
        while (randomNumber < 0.8) { // We cannot know how many iterations we will need to reach a random number which is greater or equal than 0.9.
            System.out.println(randomNumber + " is not accepted!");
            randomNumber = Math.random();
        }
        System.out.println("Random number found!\n" + randomNumber);
        System.out.println("We use while loop if we don't know precisely how much iterations we will need.");

        //Do While (alternative to while)
        String input;
        do {
            System.out.println("Do you want to continue? (y/n): ");
            input = sc.nextLine(); // This line extracts the user input
        } while (!input.equals("n")); // Our condition is working while user input is not equal to "n"
        System.out.println("We use do while loop if we don't know precisely how much iterations we will need, but we still want to execute the code at least one time even if the loop condition is false. Do while is used rarely.");
    }
}
