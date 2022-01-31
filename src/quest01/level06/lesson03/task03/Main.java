package quest01.level06.lesson03.task03;

import java.util.Scanner;

/*
Максимальное из N чисел
*/

public class Main {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        array = new int[count];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
