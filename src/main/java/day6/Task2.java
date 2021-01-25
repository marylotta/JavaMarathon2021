package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2010, 75, 183500);
        airplane.setYear(1990);
        airplane.setLength(76);
        airplane.fillUp(1000);
        airplane.fillUp(2500);

        airplane.info();

    }
}