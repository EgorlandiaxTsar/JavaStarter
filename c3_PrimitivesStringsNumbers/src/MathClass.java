public class MathClass {
    public static void main(String[] args) {
        System.out.println("Here you can find Math class examples:");

        // Examples
        int power = (int) Math.pow(4, 2); // Power 2 of 4
        double squareRoot = Math.sqrt(16); // Square root of 16
        int absoluteValue = Math.abs(-16); // Absolute value of -16 |16|
        int max = Math.max(16, 32); // Maximal number between 16 and 32
        int min = Math.min(16, 32); // Minimal number between 16 and 32
        double log = Math.log(16); // Logarithm of 16


        double sine = Math.sin(16); // Trigonometric sine of 16
        double cosine = Math.cos(16); // Trigonometric cosine of 16
        double tangent = Math.tan(16); // Trigonometric tangent of 16


        double random = Math.random(); // Chooses a random double between 0 and 1
        double rounded = Math.round(16.0387); // Rounds a decimal number to the nearest integer
        double roundedUp = Math.ceil(16.0001); // Rounds a decimal number to the nearest greater integer
        double roundedDown = Math.floor(16.9999); // Rounds a decimal number to the nearest lower integer

        // Links
        System.out.println("To know more about Math class, visit official docs in https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html");
    }
}
