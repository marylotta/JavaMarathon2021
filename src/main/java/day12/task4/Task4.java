package day12.task4;
/*
4.  *Выполнять в подпапке task4 в day12*
Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять и удалять участников.
 Под участником понимается строка (String) с именем и фамилией. Реализовать статический метод слияния групп (в классе MusicBand),
 т.е. все участники группы А переходят в группу B. Название метода: transferMembers.
 Этот метод принимает в качестве аргументов два экземпляра класса MusicBand. В классе MusicBand, реализовать метод printMembers(),
  печатающий список участников в консоль и метод getMembers(), возвращающий список участников.
Проверить состав групп после слияния.

 */

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Joe");
        members1.add("Jil");
        members1.add("Jack");
        MusicBand band1 = new MusicBand("A",1999,members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Al");
        members2.add("Anna");
        members2.add("Alu");

        MusicBand band2 = new MusicBand("S", 2010,members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();
    }
}
