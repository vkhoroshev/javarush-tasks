package quest01.level06.lesson05.task01;

/*
Таблица умножения
*/

public class Main {
    public static final int SIZE = 10;
    public static int[][] MULTIPLICATION_TABLE = new int[SIZE][SIZE];

    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            MULTIPLICATION_TABLE[0][i] = i + 1;
            MULTIPLICATION_TABLE[i][0] = i + 1;
        }

        for (int i = 1; i < SIZE; i++) {
            for (int j = 1; j < SIZE; j++) {
                MULTIPLICATION_TABLE[i][j] = MULTIPLICATION_TABLE[i][0] * MULTIPLICATION_TABLE[0][j];
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}
