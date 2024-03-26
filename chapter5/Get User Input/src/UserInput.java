/**
 * Name: Maxiemus Nguyen
 * Class: Itec 2140
 * Program ItelliJ 2023.2
 * Description: the method called in each case is determined by the parameter types provided in the method call. The compiler selects the method with the most specific parameter types that match the arguments provided.
 */
import java.util.Scanner;

public class UserInput {

    // Method to get user input and return as a String
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    // Main method to test the getInput method
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        String userInputString = userInput.getInput();
        System.out.println("User entered: " + userInputString);
    }
}
