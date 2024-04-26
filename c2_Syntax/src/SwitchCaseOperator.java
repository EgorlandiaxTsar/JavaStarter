// RUN ME!
import java.util.Scanner;

public class SwitchCaseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Ignore

        System.out.println("Here you can find switch case example:");

        //Example
        System.out.print("Enter employee name: ");
        String employeeName = sc.nextLine();
        int employeeSalary;
        switch (employeeName) { // In parentheses, we indicate the value that we will compare.
            case "Mike": // After the keyword “case” we write a possible value and then add “:” and start writing code with a new one.
                employeeSalary = 1000;
                break; // After writing the conditions, the keyword “break” is placed; this means that after passing one condition, we do not compare further. Setting “break” is optional, and it depends on the logic of your program, but in most cases it is offered.
            case "Alex":
                employeeSalary = 1500;
                break;
            case "John":
                employeeSalary = 2700;
                break;
            case "Anna":
                employeeSalary = 1200;
                break;
            case "Albert":
                employeeSalary = 1400;
                break;
            default: // Keyword "default" is the same "else", and similarly in "switch case" it’s also optional.
                employeeSalary = 500;
                break;
        }
        System.out.println(employeeName + "'s salary is " + employeeSalary);
    }
}
