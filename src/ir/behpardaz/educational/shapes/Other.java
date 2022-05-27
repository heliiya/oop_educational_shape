package ir.behpardaz.educational.shapes;

public class Other extends Shape {

	private final double perimeter;
	private final double area;
	private final int sideCount;
	private final double radiusOfIncircle;
	private final double radiusOfExcircle;
	
	public Other(String name, double perimeter, double area, int sideCount, double radiusOfIncircle, double radiusOfExcircle) {
		super(name);
		this.perimeter = perimeter;
		this.area = area;
		this.sideCount = sideCount;
		this.radiusOfIncircle = radiusOfIncircle;
		this.radiusOfExcircle = radiusOfExcircle;
	}
	
	@Override
	public double getPerimeter() {
		return this.perimeter;
	}

	@Override
	public double getArea() {
		return this.area;
	}

	@Override
	public int getSideCount() {
		return this.sideCount;
	}

	@Override
	public double getRadiusOfIncircle() {
		return this.radiusOfIncircle;
	}

	@Override
	public double getRadiusOfExcircle() {
		return this.radiusOfExcircle;
	}

}