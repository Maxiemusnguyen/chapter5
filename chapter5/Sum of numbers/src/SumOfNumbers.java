/**
 * Name: Maxiemus Nguyen
 * Class: Itec 2140
 * Program ItelliJ 2023.2
 * Description: the method called in each case is determined by the parameter types provided in the method call. The compiler selects the method with the most specific parameter types that match the arguments provided.
 */
public class SumOfNumbers {

    // Method to sum two integers
    public int sum1(int num1, int num2) {
        System.out.println("Inside sum1 method (int)");
        return num1 + num2;
    }

    // Method to sum two doubles
    public double sum2(double num1, double num2) {
        System.out.println("Inside sum2 method (double)");
        return num1 + num2;
    }

    // Main method to test the sum methods
    public static void main(String[] args) {
        SumOfNumbers calculator = new SumOfNumbers();

        // Calling sum2 with two doubles
        double resultDouble = calculator.sum2(3.5, 4.5);
        System.out.println("Result of sum2 with doubles: " + resultDouble);

        // Calling sum1 with two ints
        int resultInt = calculator.sum1(5, 7);
        System.out.println("Result of sum1 with ints: " + resultInt);

        // Calling sum2 with one double and one int
        double resultMixed = calculator.sum2(2.5, 3);
        System.out.println("Result of sum2 with mixed types: " + resultMixed);
    }
}

