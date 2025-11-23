
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock Paper Scissors !!! \n Choose your move (rock, paper, scissors)");
        String a = sc.next();

        String b = "";

        switch (a){
            case "rock":
            b = "paper";
            break;
            case "paper":
            b = "scissors";
            break;
            case "scissors":
            b = "rock";
            break;
            default:
            System.out.println("Invalid input");
        }
        System.out.println(" A chose " + a);
        System.out.println(" B chose " + b);
        System.out.println("Player B wins !");

    }
}