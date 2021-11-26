package quest01.level04.lesson05.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if ((value > max) && (value % 2 == 0)) {
                max = value;
            }
        }
        System.out.println(max);
    }
}
