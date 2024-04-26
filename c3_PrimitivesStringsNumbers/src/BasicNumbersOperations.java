public class BasicNumbersOperations {
    public static void main(String[] args) {
        System.out.println("Here you can find basic numbers operations examples:");

        // Basic operations
        System.out.println("In Java, math operations are written just like on the paper! ");
        int a = 10;
        int b = 5;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;

        // Expressions
        System.out.println("The expressions solving algorythm is solved in the same way that you did in school.");
        int expression = 6 - 4 / 2; // The result will be 4
        int anotherExpression = (6 - 4) / 2; // The result will be 1
        System.out.println("6 - 4 / 2 = " + expression);
        System.out.println("(6 - 4) / 2 = " + anotherExpression);

        // Division
        System.out.println("Java has an important feature to consider when dealing with division: if you are dividing int by double or double by double, the output will be a double, but if you want to assign the output to an int variable, then you will need to do type conversion.");
        int integerDivision = (int) (7.5 / 2); // The result is 3.75, but it will be rounded to 3
        double doubleDivision = 7.5 / 2; // The result will be 3.75, instead of 3
        System.out.println("[int] 7.5 / 2 = " + integerDivision);
        System.out.println("[double] 7.5 / 2 = " + doubleDivision);
        System.out.println("Always remember, when casting a double to an int, the decimal part will be cut off!");

        // Modulo operator
        System.out.println("Sometimes we need to know the remaining part after division, for this type of task Java has a great operator that is called \"modulo\" operator.");
        for (int i = 1; i < 11; i++) { // Checking the first 10 numbers
            if (i % 2 == 0) { // Here is our operator
                System.out.println(i + " is odd");
            } else {
                System.out.println(i + " is not odd");
            }
        }
    }
}
