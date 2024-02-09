import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountVowels {
    public static void main(String[] args) {
        //input a sentence
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowelCount = countUniqueVowels(sentence);
        //print the number of vowels in the sentence
        System.out.println("Number of unique vowels in the sentence: " + vowelCount);
    }

    public static int countUniqueVowels(String sentence) {
        Set<Character> vowels = new HashSet<>();
        // Add all vowels to the set
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;
        // Convert the sentence to lowercase to simplify comparison
        sentence = sentence.toLowerCase();

        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            // Check if the character is a vowel and hasn't been counted before
            if (vowels.contains(ch)) {
                count++;
                // Remove the vowel from the set to prevent counting it again
                vowels.remove(ch);
            }
        }

        return count;
    }
}
