package my.shape;

public class Rectangle extends Point {
    private double length;
    private double width;

    public Rectangle(double len, double wid, double a, double b) {
        super(a, b);  // call the superclass constructor
        length = ( len >= 0 ? len : 0 );
        width  = ( wid >= 0 ? wid : 0 );
    }

    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Center = " + super.toString() +
                "; Length = " + length + ", Width = " + width;
    }

    @Override
    public String getName() {
        if (length == width) return "Square";
        else return "Rectangle";
    }
}
