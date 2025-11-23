// Accept a Praragraph and display all unique words
import java.util.*;

public class paragraph_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        String[] words = paragraph.toLowerCase().split("\\W+");
        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                uniqueWords.add(word);
            }
        }

        System.out.println("Unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        sc.close();
    }
}
