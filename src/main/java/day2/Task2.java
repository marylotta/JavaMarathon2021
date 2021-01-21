package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a < b) {

            for (a++; a < b; a++) {
                if (a % 5 == 0 && a % 10 != 0) {
                    System.out.print(a + " ");
                }
            }
        } else if (a >= b) {
            System.out.println("Некорректный ввод");
        }
    }
}