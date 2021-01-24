package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2020);
        car1.setColor("White");
        car1.setModel("Honda");

        System.out.println("Год выпуска: " + car1.getYear());
        System.out.println("Цвет: " + car1.getColor());
        System.out.println("Модель: " + car1.getModel());

    }
}