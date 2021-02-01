package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("As", 19));
        members1.add(new MusicArtist("Af", 18));
        members1.add(new MusicArtist("Av", 29));

        MusicBand band1 = new MusicBand("Asso", 1990, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Nil", 22));
        members2.add(new MusicArtist("Nick", 23));

        MusicBand band2 = new MusicBand("Kind", 1999, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();

    }
}