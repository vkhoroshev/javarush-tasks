package quest01.level03.lesson03.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";

        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();

        if (temp < 0) {
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }
    }
}
