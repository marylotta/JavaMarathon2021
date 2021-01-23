package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        int countBiggerThan8 = 0;
        for (int number : array) {
            if (number > 8) {
                countBiggerThan8++;
            }
        }
        int countEquals1 = 0;
        for (int number : array) {
            if (number == 1) {
                countEquals1++;
            }
        }
        int countEven = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                countEven++;
            }
        }
        int countOdd = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                countOdd++;
            }
        }
        int sum = 0;
        for (int number : array) {
            sum += number;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + countBiggerThan8);
        System.out.println("Количество чисел равных 1: " + countEquals1);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}