package Math;

public abstract class Randomizer {
    // instance variables

    // static variables - setting ranges for different attributes to be
    // randomized within
    // shape dimensions, sides
    private static final int minSide = 1;
    private static final int maxSide = 600;
    private static final int rangeSide = maxSide - minSide + 1;
    // coordinates
    private static final int minCoordinate = 0;
    private static final int maxCoordinate = 1200;
    private static final int rangeCoordinate =
            maxCoordinate - minCoordinate + 1;
    // color RGB
    private static final int minRGB = 0;
    private static final int maxRGB = 255;
    private static final int rangeRGB = maxRGB - minRGB + 1;
    // time units ms - short range
    private static final int minMILLISHORT = 40;
    private static final int maxMILLISHORT = 300;
    private static final int rangeMILLISHORT = maxMILLISHORT - minMILLISHORT + 1;
    // mid range
    private static final int minMILLIMID = 500;
    private static final int maxMILLIMID = 3000;
    private static final int rangeMILLIMID = maxMILLIMID - minMILLIMID + 1;
    // wide range
    private static final int minMILLIWIDE = 2000;
    private static final int maxMILLIWIDE = 5000;
    private static final int rangeMILLIWIDE = maxMILLIWIDE - minMILLIWIDE + 1;
    // getter methods
    public static int randomizeSide() {
        return (int) Math.floor(Math.random() * rangeSide + minSide);
    }

    public static int randomizeCoordinate() {
        return (int) Math.floor(Math.random() * rangeCoordinate + minCoordinate);
    }

    public static int randomizeColor() {
        return (int) Math.floor(Math.random() * rangeRGB + minRGB);
    }

    public static int randomizeTimeShort() {
        return (int) Math.floor(Math.random() * rangeMILLISHORT + minMILLISHORT);
    }

    public static int randomizeTimeMid() {
        return (int) Math.floor(Math.random() * rangeMILLIMID + minMILLIMID);
    }

    public static int randomizeTimeWide() {
        return (int) Math.floor(Math.random() * rangeMILLIWIDE + minMILLIWIDE);
    }
}
