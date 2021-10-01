package quest01.level03.lesson06.task01;

import java.util.Scanner;

public class Main {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isExists = false;
        if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
            isExists = true;
        }

        String result = (isExists) ? TRIANGLE_EXISTS : TRIANGLE_NOT_EXISTS;
        System.out.println(result);
    }
}
