package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file));

    }
    public static List<Person> parseFileToObjList(File file){
        List<Person> personList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(" ");
                int age = Integer.parseInt(data[1]);
                if(age <0){
                    throw new IllegalArgumentException();
                }
                Person person = new Person(data[0], age);
                personList.add(person);
            }
            return personList;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
