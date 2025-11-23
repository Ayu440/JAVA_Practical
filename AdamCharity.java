import java.util.Scanner;

public class AdamCharity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n =sc.nextInt();

        int total = 0;

        for (int i = 1 ; i <= n ; i++){
            total += i*i;
        }

        System.out.println("total coins : "+ total);

    }
}
