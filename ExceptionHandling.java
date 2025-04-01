import java.util.Scanner; // Import the Scanner class

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create the Scanner object

        System.out.print("Enter the dividend: ");
        int dividend = myObj.nextInt(); // Read user input for the dividend
        System.out.print("Enter the divisor: ");
        int divisor = myObj.nextInt(); // Read user input for the divisor

        try {
            int value = dividend / divisor;
            System.out.println("The value of the division is " + value); // Print the value of the operation
        }
        catch(ArithmeticException e) {
            System.out.println("Error: " + e); //Print the error message
            System.out.println("Cannot divide by zero"); // Print the meaningful message
        }
    }
}