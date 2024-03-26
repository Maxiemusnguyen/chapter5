/**
 * Name: Maxiemus Nguyen
 * Class: Itec 2140
 * Program ItelliJ 2023.2
 * Description: the method called in each case is determined by the parameter types provided in the method call. The compiler selects the method with the most specific parameter types that match the arguments provided.
 */
import java.util.Scanner;

public class EvenNumber {

    // Method to check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to print whether the number is even or odd based on the isEven method
    public void printEven(boolean isEven) {
        if (isEven) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    // Main method to get user input and test the functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        scanner.close();

        EvenNumber evenNumber = new EvenNumber();
        boolean isEven = evenNumber.isEven(userInput);
        evenNumber.printEven(isEven);
    }
}
