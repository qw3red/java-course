package my.exceptions;

public class NegativeValueException extends Exception {
    private double number;

    public NegativeValueException(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NegativeValueException{" +
                "number=" + number +
                "} " + super.toString();
    }
}
