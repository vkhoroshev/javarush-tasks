package quest01.level04.lesson03.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String text = name + " любит меня.";

        int number = 0;
        while (number < 10) {
            System.out.println(text);
            number++;
        }
    }
}
