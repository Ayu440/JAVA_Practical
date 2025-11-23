import java.util.Scanner;

public class AssignmentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();
        
        // Arithmetic operations
        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        
        if (b != 0) {
            System.out.println("a / b = " + (a / b));
        } else {
            System.out.println("a / b = Cannot divide by zero");
        }
        
        // Assignment operations
        System.out.println("\n--- Assignment Operations ---");
        double result = a;
        System.out.println("Initial result = a = " + result);
        
        result += b;  // result = result + b
        System.out.println("After result += b: " + result);
        
        result = a; // Reset
        result -= b;  // result = result - b
        System.out.println("After result -= b: " + result);
        
        result = a; // Reset
        result *= b;  // result = result * b
        System.out.println("After result *= b: " + result);
        
        if (b != 0) {
            result = a; // Reset
            result /= b;  // result = result / b
            System.out.println("After result /= b: " + result);
        } else {
            System.out.println("Cannot perform result /= b (division by zero)");
        }
        
    }
}
