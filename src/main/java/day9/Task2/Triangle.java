package day9.Task2;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double x = (a + b + c) / 2;
        double square = Math.sqrt(x * (x - a) * (x - b) * (x - c));
        return square;
    }

    @Override
    public double perimeter() {
        double p = a + b + c;
        return p;
    }
}