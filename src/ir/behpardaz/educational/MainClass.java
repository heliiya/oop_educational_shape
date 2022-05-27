package ir.behpardaz.educational;

import ir.behpardaz.educational.shapes.Circle;
import ir.behpardaz.educational.shapes.Shape;

public class MainClass {

    public static void main(String[] args) {
        Shape shape = new Circle("circle", 2);
        double area = shape.getArea();
        System.out.println(shape.toString());
    }

}