package ir.behpardaz.educational.shapes;

public abstract class RegularPolygon extends Shape {

    private final double side;

    public RegularPolygon(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getPerimeter() {
        return side * getSideCount();
    }

    @Override
    public abstract double getArea(); /*{
		double height = getRadiusOfIncircle();
		int sideCount = getSideCount();
		double triangleArea = (sideCount * height) / 2;
		return triangleArea * sideCount;
	}*/

    @Override
    public double getRadiusOfIncircle() {
        int sideCount = getSideCount();
        return side / (2 * Math.tan(Math.toRadians(180) / sideCount));
    }

    @Override
    public double getRadiusOfExcircle() {
        double triangleRule = side / 2;
        double height = getRadiusOfIncircle();
        return java.lang.Math.sqrt(triangleRule * triangleRule + height * height);
    }

    @Override
    public abstract int getSideCount();

}