package day9.Task2;

public class Rectangle extends Figure {
    private double hight;
    private double width;

    public Rectangle(double hight, double width, String color) {
        super(color);
        this.hight = hight;
        this.width = width;
    }

    @Override
    public double area() {
        double square = hight * width;
        return square;
    }

    @Override
    public double perimeter() {
        double p = (hight + width) * 2;
        return p;
    }

}