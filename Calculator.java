import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner stringscan = new Scanner(System.in);

        System.out.println("Steven's Calculator");
        System.out.println("");
        System.out.println("Enter 1st number:");
        double num1 = scan.nextDouble();
        System.out.println("Choose operator: + - * / % ");
        String op = stringscan.nextLine();
        System.out.println("Enter 2nd number:");
        double num2 = scan.nextDouble();

        if (op.equalsIgnoreCase("+")) {
            double add = num1 + num2;

            System.out.println("Output number is: " + add);
        } else if (op.equalsIgnoreCase("-")) {
            double sub = num1 - num2;

            System.out.println("Output number is: " + sub);
        } else if (op.equalsIgnoreCase("*")) {
            double mul = num1 * num2;

            System.out.println("Output number is: " + mul);
        } else if (op.equalsIgnoreCase("/")) {
            double div = num1 / num2;

            System.out.println("Output number is: " + div);
        } else if (op.equalsIgnoreCase("%")) {
            double mod = num1 % num2;

            System.out.println("Output number is: " + mod);
        } else {
            System.out.println("Invalid input");
            System.exit(0);
        }

    }

}