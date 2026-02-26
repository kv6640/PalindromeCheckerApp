/**
 *        MAIN CLASS - UseCase3PalindromCheckerApp
 * Use Case 3: Reverse String Palindrome Check
 *
 * Description
 * This class checks whether a string is a palindrome
 * by reversing the string comparing it with the original value
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * -compares original and reversed strings
 * - Displays
 *
 * This introduces transformation based valiadtion
 *
 */


public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "LEVEL";
        String reversed = "";

        // Loop to iterate through characters in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation (+) creates a new String object each time due to Immutability
            reversed = reversed + original.charAt(i);
        }

        // equals() Method compares actual content, not memory references
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}