// RUN ME!
public class VariablesInitialization {
    public static void main(String[] args) {
        System.out.println("Here you can find example of how to initialize a variable: ");

        // Variables with preassigned values
        System.out.println("There are 2 types of variables:\n1. Variable with preassigned value = <type> <name> = <value>");
        int /* <--- variable type */ variableWithPreassignedValue /* <--- variable name */ = 100; // <--- variable value

        // Variables without preassigned values
        System.out.println("2. Variable without preassigned value = <type> <name>;");
        int /* <--- variable type */ variableWithoutPreassignedValue /* <--- variable name */ ; // <--- column at the end means that variable value is default

        // Variables default values
        int     a; // Have to assign before use
        double  b; // Have to assign before use
        float   c; // Have to assign before use
        boolean d; // Have to assign before use
        Object  e; // null
    }
}
