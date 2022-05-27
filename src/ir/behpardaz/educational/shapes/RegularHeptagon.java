package ir.behpardaz.educational.shapes;

public class RegularHeptagon extends RegularPolygon {

    public RegularHeptagon(String name, double side) {
        super(name, side);
    }

    @Override
    public double getArea() {
        double side = getSide();
        double cot_PI_7 = (java.lang.Math.cos(java.lang.Math.toDegrees(180) / 7)) / (java.lang.Math.sin(java.lang.Math.toDegrees(180) / 7));
        return (7 / 4) * (side * side) * cot_PI_7;
    }

    @Override
    public int getSideCount() {
        return 7;
    }

}