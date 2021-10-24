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

    private static int minRGB = 127;
    private static int maxRGB = 255; // (127 is MIDI range; no particular
    // reason for that)
    private static int rangeRGB = maxRGB - minRGB + 1;

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
