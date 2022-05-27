package ir.behpardaz.educational.shapes;

public class Rectangle extends Parallelogram implements RectangleLike {

    public Rectangle(String name, double length, double width) {
        super(name, length, width, width);
    }

    @Override
    public double getRadiusOfIncircle() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getRadiusOfExcircle() {
        double length = getLength();
        double width = getWidth();
        return java.lang.Math.sqrt(length * length + width * width) / 2;
    }

}