package Shapes;

import Functions.Randomizer;

public class Rectangle {
    // instance variables
    // sides
    private int height;
    private int width;
    // coordinates
    private int xCoordinate;
    private int yCoordinate;
    // RGB
    private int red;
    private int green;
    private int blue;

    // static variables
    private static int count = 0;
    // --------------------------------

    // initialisation block
    { }
    // --------------------------------

    // constructors
    // constructor 1 - 7 parameters; 2 sides, 2 coordinates, 3 for R G B
    public Rectangle(int height, int width, int xCoordinate,
                        int yCoordinate, int red, int green, int blue) {
        setHeight(height);
        setWidth(width);
        setXCoordinate(xCoordinate);
        setYCoordinate(yCoordinate);
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

//    // constructor 2 - 2 parameters
//    protected Rectangle(double height, double width) {
//        this(height, width, 0, 0);
//    }

    // constructor 3 - no parameters
    public Rectangle() {
        this(1, 1, 1, 1, 0, 0, 0);
    }
//
//    // constructor 4 - 1 parameter (useful for a square)
//    protected Rectangle(double side) { // for square, side = height and width
//        this(side, side);
//    }
//

    // constructor 5 - copy a rectangle
    public Rectangle(Rectangle rectangleToCopy) {
        this(rectangleToCopy.getH(), rectangleToCopy.getW(),
                rectangleToCopy.getX(), rectangleToCopy.getY(),
                rectangleToCopy.getRed(), rectangleToCopy.getGreen(),
                rectangleToCopy.getBlue());
    }
    // ---------------------------------

    // methods
    // setters
    public void setHeight(int height) {
        this.height = takeAbsoluteValue(height) * Randomizer.randomizeSide();
    }

    public void setWidth(int width) {
        this.width = takeAbsoluteValue(width) * Randomizer.randomizeSide();
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate * Randomizer.randomizeCoordinate();
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate * Randomizer.randomizeCoordinate();
    }

    public void setRed(int red) {
        this.red = red * Randomizer.randomizeColor();
    }

    public void setGreen(int green) {
        this.green = green * Randomizer.randomizeColor();
    }

    public void setBlue(int blue) {
        this.blue = blue * Randomizer.randomizeColor();
    }

    // getters
    public int getH() {
        return height;
    }

    public int getW() {
        return width;
    }

    public int getX() {
        return xCoordinate;
    }

    public int getY() {
        return yCoordinate;
    }

    public int getRed() { return red; }

    public int getGreen() { return green; }

    public int getBlue() { return blue; }

    public static int getCount() {
        return count;
    }

    // other methods
    // example private method
    private int takeAbsoluteValue(int originalValue) {
        return Math.abs(originalValue);
    }
}
