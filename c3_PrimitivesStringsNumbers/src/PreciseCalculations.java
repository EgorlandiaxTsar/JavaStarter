import java.math.BigDecimal;
import java.math.BigInteger;

public class PreciseCalculations {
    public static void main(String[] args) {
        System.out.println("Here you can find BigInteger/BigDecimal class info:");

        // Java precise calculations paradox
        System.out.println("Because of computers specific calculations algorithms, we can find unexpected results when dealing with doubles, check this equation:");
        double a = 1.1 + 1.1 + 1.1; // Paradoxically, the value will be 3.3000 ... 001 instead of 3.3
        System.out.println("1.1 + 1.1 + 1.1 won't return 3.3, but will return " + a);
        long b = 1_000_000_000L;
        b = (long) Math.pow(b, 100);
        System.out.println("Another example is with very big numbers, for example if we want to get power 100 of a billion, we won't get the correct result, but the one that is not surpassing our datatype limits: " + b);

        // Solution: BigInteger/BigDecimal classes
        System.out.println("To solve this precise calculations issues, in Java, there are 2 classes: BigInteger, for integer numbers, and BigDecimal, for fractional numbers.");
        BigInteger bigInteger = new BigInteger("10000000000000000"); // We can pass a string or a number, but string is recommended
        BigDecimal bigDecimal = new BigDecimal(5240.3560);

        // Basic operations with BigInteger/BigDecimal
        System.out.println("Basic operations supported by BigInteger/BigDecimal classes are +, -, *, / and % (modulo).");
        bigDecimal = bigDecimal.add(new BigDecimal("35.70")); // Addition
        bigDecimal = bigDecimal.subtract(new BigDecimal("-37.90")); // Subtraction
        bigDecimal = bigDecimal.multiply(new BigDecimal(80)); // Multiplication
        bigDecimal = bigDecimal.divide(new BigDecimal("2.5")); // Division
        BigDecimal remainder = bigDecimal.remainder(new BigDecimal(100)); // Equivalent of %

        // Export values
        System.out.println("We can export values of BigInteger/BigDecimal with method \"<datatype>Value\".");
        long bLong = bigDecimal.longValue(); // Returns a long value
        int bInt = bigDecimal.intValue(); // Returns a int value
        double bDouble = bigDecimal.doubleValue(); // Returns a double value
        float bFloat = bigDecimal.floatValue(); // Returns a float value

        // Comparison and another utility
        System.out.println("\"Big\" classes contain also methods for comparison, like \"equals()\" or \"compareTo()\", and methods of utility like \"abs()\" and \"pow()\".");
        bigDecimal = bigDecimal.abs(); // Returns an absolute value of b (|b|)
        bigDecimal = bigDecimal.pow(5); // Power of 5
        int comparatorResult = bigDecimal.compareTo(new BigDecimal("90.980")); // Returns 1 of b >, 0 if equal and -1 if b <
        boolean equal = bigDecimal.equals(new BigDecimal("90.980")); // Returns true if numbers are equal, otherwise false

        // Links
        System.out.println("You can find more about BigInteger and BigDecimal in the official docs: https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html for BigInteger and https://docs.oracle.com/javase/8/docs/api/java/math/BigDecimal.html for BigDecimal.");
    }
}
