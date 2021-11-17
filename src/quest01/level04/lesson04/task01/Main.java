package quest01.level04.lesson04.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result;

        while (true) {
            result = scanner.nextLine();
            if (result.equals("enough")) {
                break;
            }
            System.out.println(result);
        }
    }
}
