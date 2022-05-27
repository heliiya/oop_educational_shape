package ir.behpardaz.educational.shapes;

public class RegularHexagon extends RegularPolygon {

    public RegularHexagon(String name, double side) {
        super(name, side);
    }

    @Override
    public double getArea() {
        double side = getSide();
        return ((3 * java.lang.Math.sqrt(3)) / 2) * (side * side);
    }

    @Override
    public int getSideCount() {
        return 6;
    }

    @Override
    public double getRadiusOfExcircle() {
        return getSide();
    }

    @Override
    public double getRadiusOfIncircle() {
        return (java.lang.Math.sqrt(3) / 2) * getSide();
    }

}