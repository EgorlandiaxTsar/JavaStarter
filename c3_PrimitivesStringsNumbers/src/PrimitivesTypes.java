public class PrimitivesTypes {
    public static void main(String[] args) {
        System.out.println("Here you can find primitives types:");

        // Primitives
        System.out.println("There are eight primitives, but the most commonly used ones are int, long, double and boolean");
        byte b = 0x01; // Used when getting data from servers
        short s = 32767; // For arrays with small numbers
        int i = 2147483647; // For not fractional numbers, the most used
        long l = 9223372036854775807L; // For huge not fractional numbers, used for timestamps, remember to put the "L" at the end of long number
        double d = 1.7E+308; // For fractional numbers, the most used
        float f = 3.4E+38F; // For small fractional numbers, not recommended, always use double, however, if you decided to use float, remember to put the "F" at the end
        boolean bool = true; // For conditions
        char c = 'A'; // For single letters, you can also use unicode there

        // Wrapper objects
        System.out.println("Every primitive has a wrapper object, which are used rarely, but can be left uninitialized and their default value will be null");
        Byte objB;
        Short objS;
        Integer objI;
        Long objL;
        Double objD;
        Float objF;
        Boolean objBool;
        Character objC;
    }
}
