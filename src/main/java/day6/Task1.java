package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Motorbike moto1 = new Motorbike(2016, "black", "Yamaha");

        car1.setYear(2020);
        car1.setColor("white");
        car1.setModel("Honda");

        car1.info();
        moto1.info();
        System.out.println(car1.yearDifference(2021));
        System.out.println(moto1.yearDifference(2021));

    }
}