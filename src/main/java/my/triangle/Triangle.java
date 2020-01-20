package my.triangle;

public class Triangle {

    private double base;
    private double verticalHeight;

    public Triangle() {
        super();
    }

    public Triangle(double base, double verticalHeight) {
        this.base = base;
        this.verticalHeight = verticalHeight;
    }

    /**
     * Calculates area of a triangle using base and vertical height
     * @param base
     * @param verticalHeight
     * @return
     */
    public double calculateArea(double base, double verticalHeight) {
        return base*verticalHeight/2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getVerticalHeight() {
        return verticalHeight;
    }

    public void setVerticalHeight(double verticalHeight) {
        this.verticalHeight = verticalHeight;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", verticalHeight=" + verticalHeight +
                '}';
    }
}
