package quest01.level04.lesson09.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        if (radius < 0) {
            return;
        }

        double pi = 3.14;
        int S = (int) (pi * radius * radius);

        System.out.println(S);
    }
}
