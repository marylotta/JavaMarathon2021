package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileMissingShoes = new File("C:\\JavaProjects\\JavaMarathon2021\\src\\main\\resources\\missing_shoes");
        File fileShoes = new File("C:\\JavaProjects\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");
        PrintWriter pw = new PrintWriter(fileMissingShoes);
        Scanner scanner = new Scanner(fileShoes);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split(";");
            int zeroNumber = Integer.parseInt(words[2]);
            if (zeroNumber == 0) {
                pw.println(words[0] + ", " + words[1] + ", " + words[2]);
            }
        }
        scanner.close();
        pw.close();

    }
}
