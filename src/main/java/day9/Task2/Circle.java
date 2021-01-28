package day9.Task2;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        double square = Math.PI * (radius * radius);
        return square;
    }

    @Override
    public double perimeter() {
        double p = (2 * Math.PI) * radius;
        return p;
    }
}