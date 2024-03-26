/**
 * Name: Maxiemus Nguyen
 * Class: Itec 2140
 * Program ItelliJ 2023.2
 * Description: the method called in each case is determined by the parameter types provided in the method call. The compiler selects the method with the most specific parameter types that match the arguments provided.
 */
import java.util.Scanner;

public class UserAddress {
    // Instance variables to hold user information
    private String name;
    private String streetAddress;
    private String city;
    private String state;

    // Method to enter name and street address
    public void nameAddress(String name, String streetAddress) {
        this.name = name;
        this.streetAddress = streetAddress;
    }

    // Method to enter city and state
    public void cityState(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // Method to print complete address
    public void printAddress() {
        System.out.println("Name: " + name);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user information
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter street address: ");
        String streetAddress = scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.print("Enter state: ");
        String state = scanner.nextLine();

        scanner.close();

        // Creating an instance of UserAddress
        UserAddress userAddress = new UserAddress();

        // Setting user information
        userAddress.nameAddress(name, streetAddress);
        userAddress.cityState(city, state);

        // Printing complete address
        System.out.println("\nComplete Address:");
        userAddress.printAddress();
    }
}
