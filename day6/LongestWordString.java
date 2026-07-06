package day6;

import java.util.Scanner;

public class LongestWordString{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        String[] words = sentence.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "");

            if (cleanWord.length() > longestWord.length()) {
                longestWord = cleanWord;
            }
        }

        System.out.println("The longest word is: " + longestWord);
        System.out.println("Length: " + longestWord.length());

        input.close();
    }
}

