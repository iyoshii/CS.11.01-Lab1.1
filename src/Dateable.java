import java.util.Scanner;

public class Dateable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        int minAge = 7+(age/2);

        System.out.println(age+"-year olds should date somebody who is at least "+minAge+" years old.");
    }
}
