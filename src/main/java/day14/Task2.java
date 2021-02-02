package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToStringList(file));

    }

    public static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String person = scanner.nextLine();
                people.add(person);

                String[] personAge = person.split(" ");
                int age = Integer.parseInt(personAge[1]);
                if (age < 0) {
                    throw new IllegalArgumentException();
                }
            }

            return people; //возвращаем список если все ок

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return null; // если не ок, возвращаем пустой список
    }

}