import java.util.Scanner;

public class WorkingWithStrings {
    public static void main(String[] args) {
        System.out.println("Here you can find basic info on how to work with strings:");

        // Concatenation
        System.out.println("Concatenation is a string feature that allows a string to be unified with other datatypes, such as int or double or other.");
        int danAge = 16;
        String danCity = "Seattle";
        String danFavoriteSubject = "Maths";
        String danInfo = "Hello, my name is Dan. I'm " + danAge + " years old. I live in " + danCity + ". My favourite subject at school is " + danFavoriteSubject;
        System.out.println("This string was obtained thanks to concatenation feature: \"" + danInfo + "\"");

        // Getting user input
        System.out.println("To get user input we have to use a special Java class called scanner, located in java.util.Scanner package.");
        Scanner sc = new Scanner(System.in); // We pass the System.in as the source from which the data will be extracted
        String userInput = sc.nextLine(); // With this method, we extract the user input
        System.out.println("You typed: " + userInput);

        // Small program to collect user data
        System.out.println("Let's test a small program written by using concatenation feature and scanner class to collect user data.");
        System.out.print("Enter your full name: ");
        String fullname = sc.nextLine(); // Getting user full name
        System.out.print("Enter your address: ");
        String address = sc.nextLine(); // Getting user address
        System.out.print("Enter your email: ");
        String email = sc.nextLine(); // Getting user email
        System.out.println("Thanks for providing information!\nYour full name is: " + fullname + "\nYour address is: " + address + "\nYour email is: " + email);
    }
}
