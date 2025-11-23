import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();
        System.out.print("Enter student's age: ");
        int age = sc.nextInt();
        System.out.print("Enter student's CGPA: ");
        double cgpa = sc.nextDouble();
        System.out.print("Enter student's grade: ");
        char grade = sc.next().charAt(0);
        
        System.out.println("\n Student Details ");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.printf("CGPA  : %.2f\n", cgpa);
        System.out.println("Grade : " + grade);
        
        sc.close();
    }
}
