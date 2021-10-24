import Shapes.Rectangle;

// note: this main app is only to simulate and test result in a text format -
// for having the results in drawn format, run the Drawing app

public class MainApp {
    public static void main(String[] args) {
        System.out.println("This program creates 20 rectangles with " +
                "random length of sides, x/y positions and RGB." +
                ".");

        for (int i = 1; i <= 20; i++) {
            Rectangle rect = new Rectangle();
            rect.setHeight(1);
            rect.setWidth(1);
            rect.setXCoordinate(1);
            rect.setYCoordinate(1);
            rect.setRed(1);
            rect.setGreen(1);
            rect.setBlue(1);
            // currently providing 1 here as parameter everywhere, but not
            // happy with it.. would like to have a version where i don't set
            // a value for parameters here at all - standard rect should be
            // generated in Rectangle - to be continued..

            int height = rect.getH();
            int width = rect.getW();
            int xCoordinate = rect.getX();
            int yCoordinate = rect.getY();
            int red = rect.getRed();
            int green = rect.getGreen();
            int blue = rect.getBlue();

            System.out.println("Rectangle " +i +": height = " +height +";" +" width = " +width +"; x = " +xCoordinate +"; y = " +yCoordinate +"; red = " +red +"; green = " +green +"; blue = " +blue);

//            System.out.println(Math.random());
        }
    }
}
