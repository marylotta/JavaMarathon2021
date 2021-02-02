package day14;
/*
3. Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический метод List<Person> parseFileToObjList(File file),

 который считывает содержимое того же файла people.txt, создает экземпляры класса “Человек” и возвращает список объектов.
  Получить данный список в методе main() и распечатать его в консоль.
В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в консоль сообщение “Файл не найден”.
 Помимо этого, если значение возраста отрицательно, необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.


Пример ответа: [{name='Mike', year=24}, {name='John', year=19}, {name='Anna', year=20}, {name='Miguel', year=5}]

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
