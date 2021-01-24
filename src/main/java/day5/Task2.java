package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike(2019, "Black", "Harley Davidson");

        System.out.println("Год выпуска: " + moto.getYear());
        System.out.println("Цвет: " + moto.getColor());
        System.out.println("Модель: " + moto.getModel());
    }
}