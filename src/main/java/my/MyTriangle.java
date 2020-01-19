package my;

import my.triangle.ThreeSideTriangle;
import my.triangle.Triangle;

public class MyTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,4);
        System.out.println("Triangle square is " + triangle.calculateArea(triangle.getBase(), triangle.getVerticalHeight()));

        Triangle triangle1 = new Triangle();
        triangle1.setBase(8);
        triangle1.setVerticalHeight(12);
        System.out.println("Triangle square is " + triangle1.calculateArea(triangle1.getBase(), triangle1.getVerticalHeight()));

        ThreeSideTriangle threeSideTriangle = new ThreeSideTriangle(4,4,5);
        double a = threeSideTriangle.getA();
        double b = threeSideTriangle.getB();
        double c = threeSideTriangle.getC();

        if(threeSideTriangle.isTriangleValid(a, b, c)) {
            double area = threeSideTriangle.calculateArea(a,b,c);
            System.out.println("Area = "+area);
        }else {
            System.out.println("Sides entered cannot form a triangle!");
        }
    }
}
