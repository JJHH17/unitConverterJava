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

    }

    public void getWeight() {

    }

    public void getTemperature() {

    }
}
