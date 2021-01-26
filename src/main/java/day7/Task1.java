package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 1990, 75, 185600);
        Airplane airplane2 = new Airplane("Airbus", 1991, 76, 188800);

       Airplane.compareAirplanes(airplane1,airplane2);

    }
}