package ir.behpardaz.educational.shapes;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract int getSideCount();

    public abstract double getRadiusOfIncircle();

    public abstract double getRadiusOfExcircle();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", perimeter='" + getPerimeter() + '\'' +
                ", area='" + getArea() + '\'' +
                ", side count='" + getSideCount() + '\'' +
                ", radius of incircle='" + getRadiusOfIncircle() + '\'' +
                ", radius of excircle='" + getRadiusOfExcircle() + '\'' +
                '}';
    }
}