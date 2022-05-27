package ir.behpardaz.educational.shapes;

public class Oval extends Shape {

    private final double smallRadius;
    private final double bigRadius;

    public Oval(String name, double smallRadius, double bigRadius) {
        super(name);
        this.smallRadius = smallRadius;
        this.bigRadius = bigRadius;
    }

    public double getSmallRadius() {
        return smallRadius;
    }

    public double getBigRadius() {
        return bigRadius;
    }

    @Override
    public double getPerimeter() {
        return java.lang.Math.PI * (smallRadius + bigRadius);
    }

    @Override
    public double getArea() {
        return java.lang.Math.PI * smallRadius * bigRadius;
    }

    @Override
    public int getSideCount() {
        return 0;
    }

    @Override
    public double getRadiusOfIncircle() {
        return smallRadius;
    }

    @Override
    public double getRadiusOfExcircle() {
        return bigRadius;
    }

    public boolean isCircle() {
        return smallRadius == bigRadius;
    }

}