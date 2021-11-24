package quest01.level04.lesson05.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (value < min) {
                min = value;
            }
        }
        System.out.println(min);
    }
}
