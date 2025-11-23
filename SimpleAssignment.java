import java.util.Scanner;

public class SimpleAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.println("Initial value: " + num);
        
        System.out.print("Enter value to add: ");
        int addValue = scanner.nextInt();
        num += addValue;
        System.out.println("After +=: " + num);
        
        System.out.print("Enter value to subtract: ");
        int subValue = scanner.nextInt();
        num -= subValue;
        System.out.println("After -=: " + num);
        
        System.out.print("Enter value to multiply: ");
        int mulValue = scanner.nextInt();
        num *= mulValue;
        System.out.println("After *=: " + num);
        
        System.out.print("Enter value to divide: ");
        int divValue = scanner.nextInt();
        if (divValue != 0) {
            num /= divValue;
            System.out.println("After /=: " + num);
        } else {
            System.out.println("Cannot divide by zero");
        }
        
        scanner.close();
    }
}
