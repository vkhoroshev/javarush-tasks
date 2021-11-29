package quest01.level04.lesson05.task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int min1 = value;
        int min2 = value;

        while (scanner.hasNextInt()) {
            value = scanner.nextInt();
            if (value == min1) {
                continue;
            } else if (value < min1) {
                min2 = min1;
                min1 = value;
            } else if (value < min2) {
                min2 = value;
            }
        }
        System.out.println(min2);
    }
}
