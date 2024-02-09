/*
Question 4: Capitalize Words
Write a program that accepts a string as input, capitalizes the first letter of each word in the
string, and then returns the result string.
 */

import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String input = scanner.nextLine();

        String result = capitalizeWords(input);

        System.out.println("Capitalized String: " + result);
    }

    public static String capitalizeWords(String str) {
        // Split the input string into words
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Capitalize the first letter of each word and append it to the result string
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }

        // Remove the trailing space and return the result
        return result.toString().trim();
    }
}
