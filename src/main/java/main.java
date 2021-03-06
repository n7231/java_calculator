import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Calculator calculator = new Calculator();

    public static void main(String[] args) {

        System.out.println("Welcome to the calculator!");

        System.out.println("Enter the first number to operate on:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number to operate on:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the operation you would like to use. Options include +, -, *, and /");
        char operation = scanner.next().charAt(0);

        try {
            calculator.runOperation(num1, num2, operation);
        } catch(Exception e) {
            System.out.println(e);
            return;
        }

        System.out.println("Would you like to continue calculating? Answer Y for yes or anything else for no.");

        while (scanner.next().charAt(0) == 'Y') {
            System.out.println("The current total is " + calculator.getTotal());
            System.out.println("Do you want to clear the calculator? Answer Y for yes or any thing else for N");

            System.out.println("Enter the number you want to operate on with the current total:");
            num1 = scanner.nextInt();

            System.out.println("Enter the operation you would like to use. Options include +, -, *, and /");
            operation = scanner.next().charAt(0);

            try {
                calculator.runOperationOnTotal(num1, operation);
            } catch (Exception e) {
                System.out.println(e);
                return;
            }

            System.out.println("Would you like to continue calculating? Answer Y for yes or N for no.");
        }

        System.out.println("The final total is " + calculator.getTotal());
    }
}