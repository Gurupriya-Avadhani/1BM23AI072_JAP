package Gurupriya_Avadhani;

import java.util.Scanner;

public class program_1a {
    public static void main(String args[]) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Gym Membership Management System!");

        // Prompt user for the member's name, age, and other details
        System.out.println("Enter the name:");
        String name = sc.nextLine();

        System.out.println("Enter the age of the member:");
        int age = sc.nextInt();

        System.out.println("Enter the status of the membership (true/false):");
        boolean membership_status = sc.nextBoolean();

        System.out.println("Enter the duration of membership (in months):");
        int duration = sc.nextInt();

        // Calculate the fee (assuming the fee is $50 per month)
        double fee = 50.00 * duration;

        // Output the member's details and calculated fee
        System.out.println("The name of the member is: " + name);
        System.out.println("The age of the member is: " + age);
        System.out.println("The membership status of the member is: " + membership_status);
        System.out.println("The duration of the member is: " + duration + " months");
        System.out.println("The fee for the member is: $" + fee);

        // Close the scanner object to prevent resource leakage
        sc.close();
    }
}