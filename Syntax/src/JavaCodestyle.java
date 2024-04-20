// RUN ME!
public class JavaCodestyle { // Correct
    public static final double PI_NUMBER = 3.14; // Correct
    public static final double piNumber = 3.14; // Wrong

    public static void main(String[] args) {
        int a = 25; // Correct
        int b=60; // Wrong

        if (a > b) {/* ... */} // Correct
        if(a>b){/* ... */} //Wrong

        for (int i = 0; i < 10; i++) {/* ... */} // Correct
        for (int i=0;i<10;i++){/* ... */} //Wrong

        // Same thing to other logical blocks

        System.out.println("Here you can find Java codestyle tips:");

        // Tips
        System.out.println("1. Classes names in PascalCase.");
        System.out.println("2. Methods (functions) and variables names in camelCase.");
        System.out.println("3. Always leave spaces between symbols, operators, loops and other logical blocks.");
        System.out.println("4. Always leave a blank line between classes and methods.");
    }

    public static String concatenateStrings(String a, String b) { // Correct
        String concatenatedString = a + b; // Correct
        return concatenatedString;
    }

    public static String Concatenate_Strings(String a,String b,String c) { // Wrong
        String concatenated_string = a + b; // Wrong
        return concatenated_string ;
    }
}

class wrongMain {/* ... */} // Wrong

class aNoThErW_Rong_maIN {/* ... */} // Wrong
