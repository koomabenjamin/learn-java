import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Request user to enter their name.
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        scanner.close();

        System.out.println("Hello world from "+ myString + " !");
    }
}