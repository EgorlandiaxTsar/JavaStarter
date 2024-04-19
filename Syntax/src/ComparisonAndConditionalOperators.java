// RUN ME!
import java.util.Scanner;

public class ComparisonAndConditionalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Ignore

        System.out.println("Here you can find comparison and conditional operators info:");

        // Comparison operators
        System.out.println("""
                           Comparison operators:
                           Equal            | == | Any
                           Not Equal        | != | Any
                           Negotiation      | !  | Boolean Values
                           Greater or Equal | >= | Numbers
                           Less or Equal    | <= | Numbers
                           Greater          | >  | Numbers
                           Less             | <  | Numbers""");
        /* Equal            | == | Any
           Not Equal        | != | Any
           Negotiation      | !  | Boolean Values
           Greater or Equal | >= | Numbers
           Less or Equal    | <= | Numbers
           Greater          | >  | Numbers
           Less             | <  | Numbers
         */

        // Conditional operators
        System.out.println("Conditional operators are: if, else and else if. If for first condition, else if for next conditions, else for any other condition.");
        System.out.print("Enter your IQ: ");
        double iq = sc.nextDouble();
        int avgIq = 100;
        if (iq < 90) {
            System.out.println("Low IQ");
        } else if (iq <= avgIq) {
            System.out.println("Avg IQ");
        } else if (iq <= 150) {
            System.out.println("High IQ");
        } else {
            System.out.println("Genius IQ");
        }

        // And + or operators
        System.out.println("And operator is &&, or operator is ||.");
        // Example with &&
        boolean isPregnant = true;
        int womenAge = 27;
        if (womenAge >= 18 && !isPregnant) { // If the girl is over 18 years old and not pregnant, then she can buy alcohol.
            System.out.println("Can buy alcohol");
        } else {
            System.out.println("Alcohol prohibited");
        }
        // Example with ||
        int age = 17;
        boolean hasId = true;
        if (age >= 18 || hasId) { // If a person is 18 or older or if he/she has his/her own ID, then he/she can vote.
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not eligible for vote");
        }
    }
}
