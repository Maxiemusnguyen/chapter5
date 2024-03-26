/**
 * Name: Maxiemus Nguyen
 * Class: Itec 2140
 * Program ItelliJ 2023.2
 * Description: the method called in each case is determined by the parameter types provided in the method call. The compiler selects the method with the most specific parameter types that match the arguments provided.
 */
public class PalindromeChecker {

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String str) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the clean string is a palindrome
        int left = 0;
        int right = cleanStr.length() - 1;
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Main method to test the isPalindrome method
    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String palindrome = "A man, a plan, a canal, Panama";
        String nonPalindrome = "Hello, World!";

        System.out.println("\"" + palindrome + "\" is a palindrome: " + palindromeChecker.isPalindrome(palindrome));
        System.out.println("\"" + nonPalindrome + "\" is a palindrome: " + palindromeChecker.isPalindrome(nonPalindrome));
    }
}
