package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        int indexNum = 0;
        int sumMax3 = 0;

        for (int i = 0; i < array.length - 2; i++) {
            int sum = array[i] + array[i + 1] + array[i + 2];
            if (sum > sumMax3) {
                sumMax3 = sum;
                indexNum = i;
            }
        }

        System.out.println(sumMax3);
        System.out.println(indexNum);

    }
}