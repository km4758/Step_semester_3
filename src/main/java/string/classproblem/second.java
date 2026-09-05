package main.java.string.classproblem;

public class second {

    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder();
            String word = words[i];

            // Build reverse of each word using a loop
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord.append(word.charAt(j));
            }

            result.append(reversedWord);

            // Join words with single spaces
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test case
        String sentence = "hello club";
        String result = reverseEachWord(sentence);
        System.out.println(result); // Output: olleh bulc
    }
}
