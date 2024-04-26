public class IncrementsDecrementsQuickOperations {
    public static void main(String[] args) {
        System.out.println("After learning basic numbers operations in Java you can find here about increments, decrements and quick operations:");

        // Increment and decrement
        System.out.println("To do a increment use ++, to do a decrement use --.");
        int a = 0;
        System.out.println(a);
        a++; // Increment
        System.out.println(a);
        a--; // Decrement
        System.out.println(a);

        // Quick operations
        System.out.println("Quick operations work with basic maths operations (+-*/), to use them just add \"=\" before the sign.");
        int b = 2;
        b += 2; // 4
        b -= 2; // 2
        b *= 4; // 8
        b /= 2; // 4
    }
}
