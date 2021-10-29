package Functionality;

import Math.Randomizer;
import Shapes.ShapeAttributes;

public class Task {
    // static ShapeAttributes generateAttributes() {
    // create rect
    // manipulate
    // return rect
    // in main: call DrawShape.method

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
                Randomizer.randomizeCoordinate() * shapeAttributes.getX();
        return rXCoordinate;
    }

    public int getRY() {
        rYCoordinate =
                Randomizer.randomizeCoordinate() * shapeAttributes.getY();
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
//
//
//        shapeAttributes.setW(Randomizer.randomizeSide());
//        shapeAttributes.setX(Randomizer.randomizeCoordinate());
//        shapeAttributes.setY(Randomizer.randomizeCoordinate());
//        shapeAttributes.setRed(Randomizer.randomizeColor());
//        shapeAttributes.setGreen(Randomizer.randomizeColor());
//        shapeAttributes.setBlue(Randomizer.randomizeColor());
//
//        int height = rect.getH();
//        int width = rect.getW();
//        int xCoordinate = rect.getX();
//        int yCoordinate = rect.getY();
//        int red = rect.getRed();
//        int green = rect.getGreen();
//        int blue = rect.getBlue();
//
//        rect = rect.getH()
//        System.out.println(rect);
//        return rect;

}
