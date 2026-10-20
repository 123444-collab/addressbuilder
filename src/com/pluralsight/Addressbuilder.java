package com.pluralsight;

import java.util.Scanner;

public class Addressbuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder address = new StringBuilder();

        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        address.append(scanner.nextLine()).append("\n\n");

        System.out.println();
        System.out.print("Billing Street: ");
        address.append("Billing Address:\n");
        address.append(scanner.nextLine()).append("\n");
        System.out.print("Billing City: ");
        address.append(scanner.nextLine()).append(", ");
        System.out.print("Billing State: ");
        address.append(scanner.nextLine()).append(" ");
        System.out.print("Billing Zip: ");
        address.append(scanner.nextLine()).append("\n\n");

        System.out.print("Shipping Street: ");
        address.append("Shipping Address:\n");
        address.append(scanner.nextLine()).append("\n");
        System.out.print("Shipping City: ");
        address.append(scanner.nextLine()).append(", ");
        System.out.print("Shipping State: ");
        address.append(scanner.nextLine()).append(" ");
        System.out.print("Shipping Zip: ");
        address.append(scanner.nextLine());

        System.out.println();
        System.out.println("Customer information:");
        System.out.println(address);

        scanner.close();
    }
}
