/**
 * ====================================================================
 *              MAIN CLASS - UseCase3PalindromCheckerApp
 * ====================================================================
 * Use Case 4: Character Array Based validation
 *
 * Description
 * This class checks whether a string is a palindrome
 * going with two pointers
 *
 * At this stage, the application:
 * - Converts String into char array
 * - uses start and end pointers
 * - compares original and reversed strings
 * - Displays the result
 *
 *  This reduces extra memory usage
 *
 */


public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "racecar";


        char[] charArray = input.toCharArray();


        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;


        while (start < end) {

            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
