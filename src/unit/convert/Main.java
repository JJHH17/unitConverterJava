package unit.convert;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Convert Fahrenheit (type 'to fahrenheit') or Celsius? (type 'to celsius') (type 'exit' to quit)");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}
