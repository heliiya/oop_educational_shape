package ir.behpardaz.educational.shapes;

public class RegularPentagon extends RegularPolygon {

    public RegularPentagon(String name, double side) {
        super(name, side);
    }

    @Override
    public double getArea() {
        double side = getSide();
        return (1 / 4) * (java.lang.Math.sqrt(5 * (5 + (2 * java.lang.Math.sqrt(5))))) * (side * side);
    }

    @Override
    public int getSideCount() {
        return 5;
    }

}