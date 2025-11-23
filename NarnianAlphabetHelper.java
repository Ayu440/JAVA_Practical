import java.util.Scanner;

public class NarnianAlphabetHelper {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the alphabet : ");
        char ch = sc.next().charAt(0);
        
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U'){
            System.out.print("Vowel");}
            else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.print("Consonant");}
        
        else{
            System.out.print("Not an alphabet");
        }   
    }
}
}
