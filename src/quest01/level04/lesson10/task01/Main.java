package quest01.level04.lesson10.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        long y = Math.round(x * 3.6);
        System.out.println(y);
    }
}
