package quest01.level06.lesson06.task02;

import java.util.Arrays;

/*
Создаем мультимассив
*/

public class Main {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(multiArray));
    }
}
