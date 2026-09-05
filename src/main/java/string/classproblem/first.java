package main.java.string.classproblem;

public class first {

    // 1. ATM PIN Length Validator
    public static void checkPinLength(String pin) {
        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    // 2. Word Reversal Encoder
    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder();
            String word = words[i];

            // Reversing the individual word using a loop and StringBuilder
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord.append(word.charAt(j));
            }

            result.append(reversedWord);

            // Append a space between words (except after the last word)
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Testing Question 1
        System.out.println("--- Question 1 Tests ---");
        checkPinLength("482");   // Output: Invalid PIN — must be exactly 4 digits.
        checkPinLength("4820");  // Output: PIN length OK.

        // Testing Question 2
        System.out.println("\n--- Question 2 Tests ---");
        String inputSentence = "hello club";
        String reversed = reverseEachWord(inputSentence);
        System.out.println(reversed); // Output: olleh bulc
    }
}