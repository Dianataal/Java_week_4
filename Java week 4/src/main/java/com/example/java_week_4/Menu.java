package com.example.java_week_4;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    private static final ArrayList<String> meals = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Options:");
            System.out.println("1. Add Meal");
            System.out.println("2. Show Menu");
            System.out.println("3. Clear Menu");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addMeal(scanner);
                    break;
                case 2:
                    showMenu();
                    break;
                case 3:
                    clearMenu();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addMeal(Scanner scanner) {
        System.out.print("Enter the meal: ");
        String meal = scanner.nextLine();
        if (!meals.contains(meal)) {
            meals.add(meal);
            System.out.println("Meal added: " + meal);
        } else {
            System.out.println("Meal already exists.");
        }
    }

    private static void showMenu() {
        if (meals.isEmpty()) {
            System.out.println("The menu is empty.");
        } else {
            System.out.println("Menu:");
            for (String meal : meals) {
                System.out.println(meal);
            }
        }
    }

    private static void clearMenu() {
        meals.clear();
        System.out.println("Menu cleared.");
    }
}
