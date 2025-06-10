package calculator;
import java.util.Scanner;
public class calci {
	public static double add(double a, double b) {
        return a + b;
    }
	public static double subtract(double a, double b) {
        return a - b;
    }
	public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("❌ Error: Division by zero is not allowed.");
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result;
        System.out.println("=====================================");
        System.out.println("      🧮 Welcome to Java Calci!      ");
        System.out.println("=====================================");
        while (true) {
            System.out.println("\n-------------------------------------");
            System.out.println("Choose an operation:");
            System.out.println("1 ➜ Addition (+)");
            System.out.println("2 ➜ Subtraction (-)");
            System.out.println("3 ➜ Multiplication (×)");
            System.out.println("4 ➜ Division (÷)");
            System.out.println("5 ➜ Exit");
            System.out.println("-------------------------------------");
            System.out.print("🔢 Enter your choice (1-5): ");
            choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("\n👋 Thank you for using Java Calci!");
                System.out.println("=====================================\n");
                break;
            }
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();
            try {
                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        System.out.println("✅ Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        System.out.println("✅ Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        System.out.println("✅ Result: " + num1 + " × " + num2 + " = " + result);
                        break;
                    case 4:
                        result = divide(num1, num2);
                        System.out.println("✅ Result: " + num1 + " ÷ " + num2 + " = " + result);
                        break;
                    default:
                        System.out.println("⚠️ Invalid choice. Please select a number between 1 and 5.");
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
