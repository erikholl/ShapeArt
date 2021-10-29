package Shapes;

public class ShapeAttributes {
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

    // constructor 3 - no parameters
    public ShapeAttributes() {
        this(1, 1, 1, 1, 1, 1, 1);
    }

    // constructor - 7 parameters; 2 sides, 2 coordinates, 3 for R G B
    public ShapeAttributes(int height, int width, int xCoordinate,
                           int yCoordinate, int red, int green, int blue) {
        setH(height);
        setW(width);
        setX(xCoordinate);
        setY(yCoordinate);
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    // constructor - copy
    public ShapeAttributes(ShapeAttributes rectangleToCopy) {
        this(rectangleToCopy.getH(), rectangleToCopy.getW(),
                rectangleToCopy.getX(), rectangleToCopy.getY(),
                rectangleToCopy.getRed(), rectangleToCopy.getGreen(),
                rectangleToCopy.getBlue());
    }

    // methods
    public void setH(int height) {
        this.height = takeAbsoluteValue(height);
    }
    public void setW(int width) {
        this.width = takeAbsoluteValue(width);
    }
    public void setX(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }
    public void setY(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    public void setRed(int red) {
        this.red = red;
    }
    public void setGreen(int green) {
        this.green = green;
    }
    public void setBlue(int blue) {
        this.blue = blue;
    }

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

    // example private method
    private int takeAbsoluteValue(int originalValue) {
        return Math.abs(originalValue);
    }
}
