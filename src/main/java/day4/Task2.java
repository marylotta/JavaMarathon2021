package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int max = array[0];
        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }
        int min = array[0];
        for (int x : array) {
            if (x < min) {
                min = x;
            }
        }
        int count = 0;
        for (int x : array) {
            if (x % 10 == 0) {
                count++;
            }
        }
        int sum = 0;
        for (int x : array) {
            if (x % 10 == 0) {
                sum += x;
            }
        }

        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + sum);

    }
}