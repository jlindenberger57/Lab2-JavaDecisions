package edu.cscc;
import java.util.Scanner;

// Lindenberger, James, 3/31/2019 - Program to determine the total cost of an item based on the cost of the shipping method and the cost of the product ordered
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    // Declarations go here
	int shippingType;
	double shippingCost, productCost, totalCost;

	// Input of productCost
    System.out.println("Shipping Costs ");
    System.out.print("Enter the cost of the product ordered: ");
    productCost = input.nextDouble();
    System.out.println("Standard shipping (enter '1') for $7.95 ");
    System.out.println("Express shipping (enter '2') for $13.95 ");
    System.out.println("Priority shipping (enter '3') for $23.95 ");

    // Input of shippingType
    System.out.print("Enter your choice (1,2 or 3): ");
    shippingType = input.nextInt();

        if (shippingType == 1) {
            shippingCost = 7.95;
            totalCost = productCost + shippingCost;
            System.out.println("The cost of the product is " + productCost + " plus shipping of " + shippingCost + " equals " + totalCost);
        } else if (shippingType == 2) {
            shippingCost = 13.95;
            totalCost = productCost + shippingCost;
            System.out.println("The cost of the product is " + productCost + " plus shipping of " + shippingCost + " equals " + totalCost);
        } else if (shippingType == 3) {
            shippingCost = 23.95;
            totalCost = productCost + shippingCost;
            System.out.println("The cost of the product is " + productCost + " plus shipping of " + shippingCost + " equals " + totalCost);
        } else if (shippingType < 1 || shippingType > 3) {
            System.out.println("You did not enter a valid type of shipping (1,2, or 3).  The total cost can not be calculated. ");
        }
    }
}
