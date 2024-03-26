/**
 * Name: Maxiemus Nguyen
 * Class: Itec 2140
 * Program ItelliJ 2023.2
 * Description: the method called in each case is determined by the parameter types provided in the method call. The compiler selects the method with the most specific parameter types that match the arguments provided.
 */
import java.util.Scanner;

public class GameScores {
    // Instance variables to hold user information
    private String name;
    private int score;

    // Method to enter the name
    public String enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        return name;
    }

    // Method to enter the score
    public int enterScore(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score for " + name + ": ");
        int score = scanner.nextInt();
        return score;
    }

    // Method to print name and score
    public void printScore(String name, int score) {
        System.out.println("Name: " + name + ", Score: " + score);
    }

    // Main method
    public static void main(String[] args) {
        GameScores gameScores = new GameScores();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String name = gameScores.enterName();
            if (name.isEmpty()) {
                break; // Exit loop if the user does not enter a name
            }
            int score = gameScores.enterScore(name);
            gameScores.printScore(name, score);
        }

        scanner.close();
    }
}
