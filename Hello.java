import java.util.Scanner;


public class Hello {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string to reverse:");

            String inputString = scanner.nextLine();
            String reversedString = new StringBuilder(inputString).reverse().toString();

            System.out.println("Reversed string:");
            System.out.println(reversedString);
        }
    }
}
      
     
