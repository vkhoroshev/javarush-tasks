package quest01.level04.lesson10.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean isOptimist = scanner.nextBoolean();

        long result = (isOptimist) ? ((int) Math.ceil(glass)) : ((int) Math.floor(glass));
        System.out.println(result);
    }
}
