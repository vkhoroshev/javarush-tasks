package quest01.level03.lesson06.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 20 || age > 60) {
            System.out.println("можно не работать");
        }
    }
}
