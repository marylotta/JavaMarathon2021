package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int Str = 0;
        int maxString = 0;
        for (int a = 0; a < array.length; a++) {
            for (int i = 0; i < array[a].length; i++) {
                Str = Str + array[0][i];
                if (Str > maxString) {
                    maxString = a;
                }
            }
        }
        System.out.println(maxString);

    }
}