package ir.behpardaz.educational.shapes;

public class Trapezoid extends Shape {

    private final double smallRule;
    private final double bigRule;
    private final double smallLeg;
    private final double bigLeg;

    public Trapezoid(String name, double smallRule, double bigRule, double smallLeg, double bigLeg) {
        super(name);
        this.smallRule = smallRule;
        this.bigRule = bigRule;
        this.smallLeg = smallLeg;
        this.bigLeg = bigLeg;
    }

    public double getSmallRule() {
        return smallRule;
    }

    public double getBigRule() {
        return bigRule;
    }

    public double getSmallLeg() {
        return smallLeg;
    }

    public double getBigLeg() {
        return bigLeg;
    }

    @Override
    public double getPerimeter() {
        return smallRule + bigRule + smallLeg + bigLeg;
    }

    @Override
    public double getArea() {
        double triangleRule = bigRule - smallRule;
        Triangle triangle = new Triangle(smallLeg, triangleRule, bigLeg);
        double triangleArea = triangle.getArea();
        double height = (triangleArea * 2) / triangleRule;
        Parallelogram parallelogram = new Parallelogram(smallRule, bigLeg, height);
        double parallelogramArea = parallelogram.getArea();
        return triangleArea + parallelogramArea;
    }

    @Override
    public int getSideCount() {
        return 4;
    }

    @Override
    public double getRadiusOfIncircle() {
        if (smallLeg == bigLeg) {
            return java.lang.Math.sqrt(smallRule * bigRule) / 2;
        }
        return getArea() / smallRule + bigRule;
    }

    @Override
    public double getRadiusOfExcircle() {
        // TODO Auto-generated method stub
        return 0;
    }

}