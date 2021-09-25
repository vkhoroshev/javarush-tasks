package quest01.level03.lesson04.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 18) {
            if (age >= 6)
                System.out.println("нужно ходить в школу");
        } else {
            System.out.println("пора в институт");
        }
    }
}
