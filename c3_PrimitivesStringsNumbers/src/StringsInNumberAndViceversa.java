public class StringsInNumberAndViceversa {
    public static void main(String[] args) {
        System.out.println("Here you can find methods to transform string in number and vice versa:");

        // String in number
        System.out.println("To transform a string in number, you can use your number type wrapper class and use the method parse<Int, Double, Long, Float and etc.>.");
        String integerStr = "90";
        String doubleStr = "90.65";
        int a = Integer.parseInt(integerStr);
        double b = Double.parseDouble(doubleStr);
        float c = Float.parseFloat(doubleStr);

        // Number to string
        System.out.println("To transform any number into a string, just use \"valueOf()\" method located in string class.");
        int myInt = 98;
        String myIntStr = String.valueOf(myInt);
    }
}
