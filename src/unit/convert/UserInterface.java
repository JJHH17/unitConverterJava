package unit.convert;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("What would you like to convert? Enter 'Distance', 'Weight' or 'Temperature'");
            String input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "distance":
                    // Enter info (from method)
                    break;

                case "weight":
                    // Enter info (from method)
                    break;

                case "temperature":
                    // enter info (from method)
                    break;

                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public void getDistance() {
        System.out.println("Convert from what? millimeters | centimeters | meters | " +
                "kilometers | inches | feet | miles");
        String unitOne = scanner.nextLine();

        System.out.println("Enter a unit to convert");
        int value = Integer.valueOf(scanner.nextLine());

        System.out.println("Convert to what? millimeters | centimeters | meters | " +
                "kilometers | inches | feet | miles");

        switch (unitOne.toLowerCase()) {
            case ("millimeters"):
                // enter code
                break;

            case ("centimeters"):
                // enter code
                break;

            case ("meters"):
                // enter code
                break;

            case ("kilometers"):
                // enter code
                break;

            case ("inches"):
                // enter code
                break;

            case ("feet"):
                // enter code
                break;

            case ("miles"):
                // enter code
                break;
        }
    }

    public void getWeight() {

    }

    public void getTemperature() {

    }
}
