package ir.behpardaz.educational.shapes;

public class Rhombus extends Parallelogram implements RhombusLike {

    private final double smallDiagonal;
    private final double bigDiagonal;

    public Rhombus(String name, double smallDiagonal, double bigDiagonal) {
        this(name,
                java.lang.Math.sqrt(smallDiagonal * smallDiagonal + bigDiagonal * bigDiagonal) / 2,
                java.lang.Math.sqrt(smallDiagonal * smallDiagonal + bigDiagonal * bigDiagonal) / 2,
                ((smallDiagonal * bigDiagonal) / 2) / (java.lang.Math.sqrt(smallDiagonal * smallDiagonal + bigDiagonal * bigDiagonal) / 2),
                smallDiagonal, bigDiagonal);
    }

    private Rhombus(String name, double length, double width, double height, double smallDiagonal, double bigDiagonal) {
        super(name, length, width, height);
        this.smallDiagonal = smallDiagonal;
        this.bigDiagonal = bigDiagonal;
    }

    @Override
    public double getSmallDiagonal() {
        return smallDiagonal;
    }

    @Override
    public double getBigDiagonal() {
        return bigDiagonal;
    }

    @Override
    public double getPerimeter() {
        return 2 * (java.lang.Math.sqrt(smallDiagonal * smallDiagonal + bigDiagonal * bigDiagonal));
    }

    @Override
    public double getArea() {
        return (smallDiagonal * bigDiagonal) / 2;
    }

    @Override
    public double getRadiusOfIncircle() {
        return (smallDiagonal * bigDiagonal) / (2 * java.lang.Math.sqrt(smallDiagonal * smallDiagonal + bigDiagonal * bigDiagonal));
    }

    @Override
    public double getRadiusOfExcircle() {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean isSquare() {
        return smallDiagonal == bigDiagonal;
    }
}