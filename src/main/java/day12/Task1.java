package day12;

import java.util.ArrayList;

/*
1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль. Добавить в середину еще 1 автомобиль,
 удалить самый первый автомобиль из списка. Вывести список в консоль.

 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Toyota");
        list.add("Honda");
        list.add("Hyundai");
        list.add("Mitsubishi");
        list.add("Fiat");

        list.add(2, "Lada");
        list.remove(0);

        for (String string : list) {
            System.out.println(string);

        }


    }
}
