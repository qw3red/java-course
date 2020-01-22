package my.shape;

public class Point extends Shape {

    private double x;
    private double y;

    public Point(double a, double b) {
        x = a; y = b;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }

    public double area() {
        return 0;
    }

    public double volume() {
        return 0;
    }

    @Override
    public String getName() {
        return "Point";
    }
}
