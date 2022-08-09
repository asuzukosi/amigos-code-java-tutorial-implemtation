package scanning;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = scanner.nextLine();

        System.out.println("The name you entered is: " + username);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int birthYear = year - age;

        System.out.println("Your birth year is either: " + birthYear + " or " + (birthYear - 1));
        scanner.close();
    }
}
