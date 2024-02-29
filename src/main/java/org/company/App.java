
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n------ Calculator Menu ------");

            System.out.println("1. Addition");

            System.out.println("2. Subtraction");

            System.out.println("3. Multiplication");

            System.out.println("4. Division");

            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    performAddition();

                    break;

                case 2:

                    performSubtraction();

                    break;

                case 3:

                    performMultiplication();

                    break;

                case 4:

                    performDivision();

                    break;

                case 5:

                    System.out.println("Exiting the program...");

                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");

                    break;

            }

        } while (choice != 5);

    }

    public static void performAddition() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");

        double num2 = scanner.nextDouble();

        double sum = num1 + num2;

        System.out.println("Sum: " + sum);

    }

    public static void performSubtraction() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");

        double num2 = scanner.nextDouble();

        double difference = num1 - num2;

        System.out.println("Difference: " + difference);

    }

    public static void performMultiplication() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");

        double num2 = scanner.nextDouble();

        double product = num1 * num2;

        System.out.println("Product: " + product);

    }

    public static void performDivision() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");

        double dividend = scanner.nextDouble();

        System.out.print("Enter the divisor: ");

        double divisor = scanner.nextDouble();

        if (divisor == 0) {

            System.out.println("Error: Division by zero is not allowed.");

        } else {

            double quotient = dividend / divisor;

            System.out.println("quotient: " + quotient);

        }

    }

}
