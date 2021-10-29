package Math;

public abstract class Randomizer {
    // instance variables

    // static variables
    private static final int minSide = 1;
    private static final int maxSide = 600;
    private static final int rangeSide = maxSide - minSide + 1;

    private static final int minCoordinate = 0;
    private static final int maxCoordinate = 1200;
    private static final int rangeCoordinate =
            maxCoordinate - minCoordinate + 1;

    private static final int minRGB = 0;
    private static final int maxRGB = 255;
    private static final int rangeRGB = maxRGB - minRGB + 1;

    public static int randomizeSide() {
        return (int) Math.floor(Math.random() * rangeSide + minSide); //
        // correction made: add the minvalue
    }

    public static int randomizeCoordinate() {
        return (int) Math.floor(Math.random() * rangeCoordinate + minCoordinate); //
        // correction made: add the minvalue
    }

    public static int randomizeColor() {
        return (int) Math.floor(Math.random() * rangeRGB + minRGB); //
        // correction made: add the minvalue
    }
}
