import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        int minPages = 100-age;

        System.out.println(age+"-year olds should read at least "+minPages+" pages before giving up on a book.");
    }
}
