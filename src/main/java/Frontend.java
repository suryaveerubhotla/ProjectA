import java.util.Scanner;

public class Frontend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        Backend backend = new Backend();
        int result = backend.squareNumber(number);
        
        System.out.println("Square of " + number + " is: " + result);
    }
}
