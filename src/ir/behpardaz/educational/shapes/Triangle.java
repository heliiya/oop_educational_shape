package ir.behpardaz.educational.shapes;

import java.util.ArrayList;

public class Triangle extends Shape {

    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;

    public Triangle(String name, double firstSide, double secondSide, double thirdSide) {
        super(name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        super(null);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double getArea() {
        if (isEquilateralTriangle())
            return ((java.lang.Math.sqrt(3)) / 4) * (firstSide * firstSide);
        if (isIsoscelesTriangle()) {
            ArrayList<Double> legAndOtherSide = getLegAndOtherSideOfIsoscelesTriangleInOrder();
            Double leg = legAndOtherSide.get(0);
            Double otherSide = legAndOtherSide.get(1);
            double height = java.lang.Math.sqrt(leg * leg - (otherSide * otherSide) / 4);
            return (otherSide * height) / 2;
        }
        if (isVerticalTriangle()) {
            ArrayList<Double> hypotenuseAndOtherSides = getHypotenuseAndOtherSidesOfVerticalTriangleInOrder();
            if (!hypotenuseAndOtherSides.isEmpty()) {
                Double side_1 = hypotenuseAndOtherSides.get(1);
                Double side_2 = hypotenuseAndOtherSides.get(2);
                return (side_1 * side_2) / 2;
            }
        }
        double p = getPerimeter() / 2;
        return java.lang.Math.sqrt(p * p - firstSide * p - secondSide * p - thirdSide);
    }

    @Override
    public int getSideCount() {
        return 3;
    }

    @Override
    public double getRadiusOfIncircle() {
        if (isEquilateralTriangle())
            return firstSide / (2 * java.lang.Math.sqrt(3));
        if (isIsoscelesTriangle()) {
            ArrayList<Double> legAndOtherSide = getLegAndOtherSideOfIsoscelesTriangleInOrder();
            if (!legAndOtherSide.isEmpty()) {
                Double leg = legAndOtherSide.get(0);
                Double otherSide = legAndOtherSide.get(1);
                return (otherSide / 2) * java.lang.Math.sqrt((2 * leg - otherSide) / (2 * leg + otherSide));
            }
        }
        if (isVerticalTriangle()) {
            ArrayList<Double> hypotenuseAndOtherSides = getHypotenuseAndOtherSidesOfVerticalTriangleInOrder();
            if (!hypotenuseAndOtherSides.isEmpty()) {
                Double hypotenuse = hypotenuseAndOtherSides.get(0);
                Double side_1 = hypotenuseAndOtherSides.get(1);
                Double side_2 = hypotenuseAndOtherSides.get(2);
                return (side_1 * side_2) / (side_1 + side_2 + hypotenuse);
            }
        }
        return getArea() / ((1 / 2) * getPerimeter());
    }

    @Override
    public double getRadiusOfExcircle() {
        if (isEquilateralTriangle())
            return firstSide / java.lang.Math.sqrt(3);
        if (isIsoscelesTriangle()) {
            ArrayList<Double> legAndOtherSide = getLegAndOtherSideOfIsoscelesTriangleInOrder();
            if (!legAndOtherSide.isEmpty()) {
                Double leg = legAndOtherSide.get(0);
                Double otherSide = legAndOtherSide.get(1);
                return (leg * leg) / java.lang.Math.sqrt(4 * leg * leg - otherSide * otherSide);
            }
        }
        if (isVerticalTriangle()) {
            ArrayList<Double> hypotenuseAndOtherSides = getHypotenuseAndOtherSidesOfVerticalTriangleInOrder();
            if (!hypotenuseAndOtherSides.isEmpty()) {
                Double hypotenuse = hypotenuseAndOtherSides.get(0);
                return hypotenuse / 2;
            }
        }
        double semiPerimeter = getPerimeter() / 2;
        return (firstSide * secondSide * thirdSide) /
                (4 * java.lang.Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide)));
    }

    private boolean isEquilateralTriangle() {
        return (firstSide == secondSide) && (firstSide == thirdSide);
    }

    private boolean isIsoscelesTriangle() {
        return (firstSide == secondSide && firstSide != thirdSide) ||
                (firstSide == thirdSide && firstSide != secondSide) ||
                (secondSide == thirdSide && secondSide != firstSide);
    }

    private ArrayList<Double> getLegAndOtherSideOfIsoscelesTriangleInOrder() {
        ArrayList<Double> leg_otherSide = new ArrayList<>();
        if (firstSide == secondSide) {
            leg_otherSide.add(firstSide);
            leg_otherSide.add(thirdSide);
        } else if (firstSide == thirdSide) {
            leg_otherSide.add(firstSide);
            leg_otherSide.add(secondSide);
        } else if (secondSide == thirdSide) {
            leg_otherSide.add(secondSide);
            leg_otherSide.add(firstSide);
        }
        return leg_otherSide;
    }

    private boolean isVerticalTriangle() {
        return ((firstSide * firstSide) == (secondSide * secondSide + thirdSide * thirdSide)) ||
                ((secondSide * secondSide) == (firstSide * firstSide + thirdSide * thirdSide)) ||
                ((thirdSide * thirdSide) == (firstSide * firstSide + secondSide * secondSide));
    }

    private ArrayList<Double> getHypotenuseAndOtherSidesOfVerticalTriangleInOrder() {
        ArrayList<Double> hypotenuse_side1_side2 = new ArrayList<>();
        if ((firstSide * firstSide) == (secondSide * secondSide + thirdSide * thirdSide)) {
            hypotenuse_side1_side2.add(firstSide);
            hypotenuse_side1_side2.add(secondSide);
            hypotenuse_side1_side2.add(thirdSide);
        } else if ((secondSide * secondSide) == (firstSide * firstSide + thirdSide * thirdSide)) {
            hypotenuse_side1_side2.add(secondSide);
            hypotenuse_side1_side2.add(firstSide);
            hypotenuse_side1_side2.add(thirdSide);
        } else if ((thirdSide * thirdSide) == (firstSide * firstSide + secondSide * secondSide)) {
            hypotenuse_side1_side2.add(thirdSide);
            hypotenuse_side1_side2.add(firstSide);
            hypotenuse_side1_side2.add(secondSide);
        }
        return hypotenuse_side1_side2;
    }

}