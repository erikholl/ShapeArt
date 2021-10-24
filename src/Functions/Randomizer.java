package Functions;

public class Randomizer {
    // instance variables

    // static variables
    private static int minSide = 1;
    private static int maxSide = 600;
    private static int rangeSide = maxSide - minSide + 1;

    private static int minCoordinate = 0;
    private static int maxCoordinate = 1200;
    private static int rangeCoordinate = maxCoordinate - minCoordinate + 1;

    private static int minRGB = 0;
    private static int maxRGB = 127; // (MIDI max :) - and keep it on the
    // darkie side
    private static int rangeRGB = maxRGB - minRGB + 1;

    public static int randomizeSide() {
        return (int) Math.floor(Math.random() * rangeSide);
    }

    public static int randomizeCoordinate() {
        return (int) Math.floor(Math.random() * rangeCoordinate);
    }

    public static int randomizeColor() {
        return (int) Math.floor(Math.random() * rangeRGB);
    }
}
