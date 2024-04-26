// RUN ME!
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Ignore

        System.out.println("Here you can find ternary operator info:");

        // Syntax
        System.out.println("Ternary operator syntax is: <type> <name> = <condition> ? <value if condition is true> : <value if condition is false>.");

        //Example
        System.out.print("Enter you age: ");
        int age = sc.nextInt();
        String majorityAgeMessage = age >= 18 ? "You reached majority age." : "You didn't reach majority age yet!";
        System.out.println(majorityAgeMessage);
    }
}
