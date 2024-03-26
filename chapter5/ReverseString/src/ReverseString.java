/**
 * Name: Maxiemus Nguyen
 * Class: Itec 2140
 * Program ItelliJ 2023.2
 * Description: the method called in each case is determined by the parameter types provided in the method call. The compiler selects the method with the most specific parameter types that match the arguments provided.
 */
public class ReverseString {

    // Method to reverse a string
    public String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Main method to test the reverseString method
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String original = "Hello, World!";
        String reversed = reverseString.reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
