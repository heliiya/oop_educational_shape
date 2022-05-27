package ir.behpardaz.educational.shapes;

public class Parallelogram extends Shape {

    private final double length;
    private final double width;
    private final double height;

    public Parallelogram(String name, double length, double width, double height) {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Parallelogram(double length, double width, double height) {
        super(null);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;


    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public int getSideCount() {
        return 4;
    }

    @Override
    public double getRadiusOfIncircle() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getRadiusOfExcircle() {
        // TODO Auto-generated method stub
        return 0;
    }


    public boolean isSquare() {
        return (width == length) && (width == height);
    }

    public boolean isRectangle() {
        return width == height;
    }

    public boolean isRhombus() {
        return width == length;
    }

}