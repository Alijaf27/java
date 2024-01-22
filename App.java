import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to metric converter!\n");
        System.out.println("Please input your query. For example, 1 km = m.\nEnter 'exit' or '-1' to exit the program");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit") || input.equals("-1")) {
                break;
            }
            processInput(input);
        }
    }

    private static void processInput(String input) {
        // Your code to parse the input and perform conversions
    }

    // Conversion methods here
}
