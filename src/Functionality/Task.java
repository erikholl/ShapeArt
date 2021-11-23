package Functionality;

import Math.Randomizer;
import Shapes.ShapeAttributes;

public class Task {
    // instance variables
    // sides
    private int rHeight;
    private int rWidth;
    // coordinates
    private int rXCoordinate;
    private int rYCoordinate;
    // RGB
    private int rRed;
    private int rGreen;
    private int rBlue;
    // time
    private long rTimeShort;
    private long rTimeMid;
    private long rTimeWide;

    ShapeAttributes shapeAttributes = new ShapeAttributes();

    public int getRH() {
        rHeight = Randomizer.randomizeSide() * shapeAttributes.getH();
        return rHeight;
    }

    public int getRW() {
        rWidth = Randomizer.randomizeSide() * shapeAttributes.getW();
        return rWidth;
    }

    public int getRX() {
        rXCoordinate =
                Randomizer.randomizeXCoordinate() * shapeAttributes.getX();
        return rXCoordinate;
    }

    public int getRY() {
        rYCoordinate =
                Randomizer.randomizeYCoordinate() * shapeAttributes.getY();
        return rYCoordinate;
    }

    public int getRRed() {
        rRed =
                Randomizer.randomizeColor() * shapeAttributes.getRed();
        return rRed;
    }

    public int getRGreen() {
        rGreen =
                Randomizer.randomizeColor() * shapeAttributes.getGreen();
        return rGreen;
    }

    public int getRBlue() {
        rBlue =
                Randomizer.randomizeColor() * shapeAttributes.getBlue();
        return rBlue;
    }

    public long getrTimeShort() {
        rTimeShort = Randomizer.randomizeTimeShort();
        return rTimeShort;
    }

}
