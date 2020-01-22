package my.shape;

public class Cylinder extends Circle {
    private double height;  // height of Cylinder

    // constructor
    public Cylinder(double h, double r, double a, double b) {
        super(r, a, b);   // call superclass constructor
        height = ( h >= 0 ? h : 0 );
    }

    // Calculate area of Cylinder (i.e., surface area)
    public double area() {
        return 2 * super.area() +
                2 * Math.PI * radius * height;
    }

    // Calculate volume of Cylinder
    public double volume() {
        return super.area() * height;
    }

    // Convert a Cylinder to a String
    @Override
    public String toString() {
        return super.toString() + "; Height = " + height;
    }

    @Override
    public String getName() {
        return "Cylinder";
    }
}
