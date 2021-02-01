package day12.task3;
/*
3. *Выполнять в подпапке task3 в day12*
Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
Создать 10 или более экземпляров класса MusicBand ,
 добавить их в список (выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен).
 Перемешать список. Создать статический метод в классе Task3:
public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп, основанных после 2000 года.
Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп.
Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand lu = new MusicBand("Lu",1999);
        MusicBand la = new MusicBand("La",2001);
        MusicBand li = new MusicBand("Li", 2000);
        MusicBand lo = new MusicBand("Lo", 1899);
        MusicBand lp = new MusicBand("Lp", 2010);

        MusicBand ls = new MusicBand("Ls", 2003);
        MusicBand lz = new MusicBand("Lz", 1992);
        MusicBand ll = new MusicBand("Ll", 1985);
        MusicBand lx = new MusicBand("Lx", 1980);
        MusicBand lk = new MusicBand("Lk", 1990);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(lu);
        bands.add(la);
        bands.add(li);
        bands.add(lo);
        bands.add(lp);
        bands.add(ls);
        bands.add(lz);
        bands.add(ll);
        bands.add(lx);
        bands.add(lk);


        Collections.shuffle(bands);

        System.out.println(bands);

        System.out.println(groupsAfter2000(bands));


    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> result = new ArrayList<>();
        for(MusicBand band: bands){
            if (band.year >2000){
                result.add(band);

            }
        }
        return result ;
    }

}
