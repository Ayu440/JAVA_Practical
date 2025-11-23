import java.util.Scanner;

public class if_else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter value of a ");
        int a = sc.nextInt();

        System.out.print("enter value of b");
        int b = sc.nextInt();

    if (a>b){
        System.out.println("a is greater");
    }
    else if (b>a){
        System.out.println("b is greater");
    }
    else{
        System.out.println("a is equal to b");
    }
}
}
