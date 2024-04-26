public class UtilStringsMethods {
    public static void main(String[] args) {
        System.out.println("Here you can find util string methods:");

        // Checking for equality
        System.out.println("String class contains specialized methods for checking if two string are equal: \"equals()\" and \"equalsIgnoreCase()\".");
        String aLowerCase = "string a";
        String aUpperCase = "STRING A";
        boolean rawEquals = aLowerCase.equals(aUpperCase); // False
        boolean ignoreCaseEquals = aLowerCase.equalsIgnoreCase(aUpperCase); // True

        // Checking the first and the last char/char sequence
        System.out.println("Sometimes we need to check the first and last char/char sequence. For this type of task you can use \"startsWith()\" and \"endsWith()\".");
        String myString = "Hello World!";
        boolean firstLetterEquals = myString.startsWith("f"); // True, sensitive to the case
        boolean lastLetterEquals = myString.endsWith("D"); // False, "d" would be true

        // Working with substrings
        System.out.println("There are a lot of methods to work with substrings, you can find them in this code.");
        myString.contains("ello"); // Checks if a string contains a char sequence
        myString.indexOf('W'); // Returns the index (from 0) of first found given char
        myString.indexOf('W'); // Returns the index (from 0) of last found given char
        myString.charAt(6); // Returns the letter at the specified index (from 0)
        myString.split("llo "); // Returns an array of substrings divided by specified char sequence

        // Changing symbols
        System.out.println("When we need to modify a string we can use methods like \"replace()\" or \"replaceAll()\" to replace string parts with new char sequence.");
        myString = "      Hello World!    ";
        myString = myString.replace("o", ""); // Replaces the first occurrence of given char sequence, the second parameter is the value to which replace
        myString = myString.replaceAll("o", ""); // Same thing as replace, but it replaces all occurrences
        myString = myString.trim(); // Removes all spaces in the start and in the end of a string

        // Getting string length
        System.out.println("To get string length just use \"length()\" method.");
        int stringLen = myString.length();
        System.out.println("\"" + myString + "\" length is " + stringLen);
    }
}
