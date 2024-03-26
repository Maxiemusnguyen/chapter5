/**
 * Name: Maxiemus Nguyen
 * Class: Itec 2140
 * Program ItelliJ 2023.2
 * Description: the method called in each case is determined by the parameter types provided in the method call. The compiler selects the method with the most specific parameter types that match the arguments provided.
 */
import java.util.Scanner;

public class RectangleSize {
    // Instance variables to hold height and width
    private int height;
    private int width;

    // Method to enter height and width for a rectangle
    public void enterRectangleSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height of the rectangle: ");
        height = scanner.nextInt();
        System.out.print("Enter width of the rectangle: ");
        width = scanner.nextInt();
        scanner.close();
    }

    // Method to calculate the area of the rectangle
    public int calculateArea() {
        return height * width;
    }

    // Method to check if the area is large or small
    public boolean isLarge(int area) {
        return area > 300;
    }

    // Method to print the size of the rectangle
    public void printSize(boolean isLarge) {
        if (isLarge) {
            System.out.println("This is a large rectangle.");
        } else {
            System.out.println("This is a small rectangle.");
        }
    }

    // Main method
    public static void main(String[] args) {
        RectangleSize rectangleSize = new RectangleSize();
        rectangleSize.enterRectangleSize();
        int area = rectangleSize.calculateArea();
        boolean isLarge = rectangleSize.isLarge(area);
        rectangleSize.printSize(isLarge);
    }
}
