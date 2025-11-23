import java.util.Scanner;
public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the temperature :");
        int temp = sc.nextInt();

        if(temp > 0){
            System.out.print("Safe for outdoor activities");
        }
        else if(temp <= 0){
            System.out.print("Too cold for outdoor activities");
        }
        else{
            System.out.print("invalid input");
        }
        
    }
}
