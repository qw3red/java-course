package my.shape;

public class Circle extends Point {
    double radius;

    public Circle(double r, double a, double b) {
        super(a, b);  // call the superclass constructor
        radius = ( r >= 0 ? r : 0 );
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Center = " + super.toString() +
            "; Radius = " + radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
