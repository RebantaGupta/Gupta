import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("illiad.txt");

        Scanner scanner = new Scanner(file);

        Set<String> uniqueWords = new HashSet<>();

        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase().replaceAll("[^a-zA-Z]", "");
            if (!word.isEmpty()) {
                uniqueWords.add(word);
            }
        }

        int numberOfUniqueWords = uniqueWords.size();

        System.out.println("Number of unique words: " + numberOfUniqueWords);

        scanner.close();
    }
}
