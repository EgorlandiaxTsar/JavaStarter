// RUN ME!
public class GeneralSyntaxRules {
    public static void main(String[] args) {
        System.out.println("Here you can find general Java syntax rules:");

        // Columns
        System.out.println("1. Always place a column after each code line, except ones that end with curly brackets and void lines.");
        int a = 1 /* ---> */ ; /* <--- */

        // Comments
        System.out.println("2. Short comments are marked with \"//\", long ones with \"/*\" at the start and \"*/\" in the end.");
        // This is a short comment
        /* And this is a long comment.
           You can write many lines.
           In the end, remember to put */

        // Double and single quotes
        System.out.println("3. Double quotes are not equal to single quotes!");
        char singleQuotes = 'A'; // This is a "char" type variable
        String doubleQuotes = "This is a full phrase";

        // Strict variables naming
        System.out.println("4. Remember, when calling a variable, it's important to spell right it's name, even with correct case!");
        int myVar = 1;
        int mYvar = 0;
        // myVar is not equal to mYvar

        // Public class name and filename must be equal!
        System.out.println("5. Your public class name and filename must be equal!");
    }
}
