package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        while (true) {
            if (s.equals("Stop")) {
                break;
            }
            if (s.equals("Москва") || s.equals("Владивосток") || s.equals("Ростов")) {
                System.out.println("Россия");
                break;
            } else if (s.equals("Рим") || s.equals("Милан") || s.equals("Турин")) {
                System.out.println("Италия");
                break;
            } else if (s.equals("Ливерпуль") || s.equals("Манчестер") || s.equals("Лондон")) {
                System.out.println("Англия");
                break;
            } else if (s.equals("Берлин") || s.equals("Мюнхен") || s.equals("Кёльн")) {
                System.out.println("Германия");
                break;
            } else {
                System.out.println("Неизвестная страна");
                break;
            }
        }
    }
}