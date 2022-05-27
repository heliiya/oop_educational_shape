package ir.behpardaz.educational.shapes;

public class Square extends Parallelogram implements RectangleLike, RhombusLike {

    public Square(String name, double side) {
        super(name, side, side, side);
    }

    @Override
    public double getRadiusOfIncircle() {
        return getLength() / 2;
    }

    @Override
    public double getRadiusOfExcircle() {
        return getLength() / java.lang.Math.sqrt(2);
    }

    @Override
    public double getSmallDiagonal() {
        double length = getLength();
        return Math.sqrt(2 * (length * length));
    }

    @Override
    public double getBigDiagonal() {
        double length = getLength();
        return Math.sqrt(2 * (length * length));
    }

}