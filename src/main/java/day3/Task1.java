package day3;
/*

 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;

        while (true) {
            s = scanner.nextLine();
            if (s.equals("Stop")) {
                break;
            }
            if (s.equals("Москва") || s.equals("Владивосток") || s.equals("Ростов")) {
                System.out.println("Россия");
            } else if (s.equals("Рим") || s.equals("Милан") || s.equals("Турин")) {
                System.out.println("Италия");
            } else if (s.equals("Ливерпуль") || s.equals("Манчестер") || s.equals("Лондон")) {
                System.out.println("Англия");
            } else if (s.equals("Берлин") || s.equals("Мюнхен") || s.equals("Кёльн")) {
                System.out.println("Германия");
            } else {
                System.out.println("Неизвестная страна");
            }
        }

    }
}