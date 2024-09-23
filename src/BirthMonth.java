import java.util.Scanner;

public class BirthMonth {

    public static void main(String[] args) {
        // START BirthMonth

        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in); // Create a Scanner object for user input
        int month; // Declare month variable

        // Prompt for user input
        System.out.print("Enter your birth month (1 - 12): ");

        // Check if the input is an integer
        if (in.hasNextInt()) {
            month = in.nextInt(); // Read the month
            in.nextLine();

            // Check if the month is within the valid range
            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        // Close the scanner
        in.close(); // Close the scanner
        // END BirthMonth
    }
}