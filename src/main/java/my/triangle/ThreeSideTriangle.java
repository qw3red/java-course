package my.triangle;

public class ThreeSideTriangle {
    private double a;
    private double b;
    private double c;

    public ThreeSideTriangle() {
    }

    public ThreeSideTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    /**
     * Calculates area of a triangle using length of its 3 sides
     */
    public double calculateArea(double a, double b, double c) {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    /**
     * Checks whether the 3 sides can form a triangle
     * The sum of any two sides must be greater than the other side
     * @param a
     * @param b
     * @param c
     * @return boolean isValid triangle
     */
    public boolean isTriangleValid(double a, double b, double c) {
        if((a+b)>c && (a+c)>b && (b+c)>a) {
            return true;
        }else {
            return false;
        }
    }
}
