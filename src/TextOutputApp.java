import Functionality.Task;

// note: this main app is only to simulate and test result in a text format -
// for having the results in drawn format, run the Drawing app

public class TextOutputApp {
    public static void main(String[] args) {
        System.out.println("This program creates 20 rectangles with " +
                "random length of sides, x/y positions and RGB." +
                ".");

        int j = 1;
        while (j < 3) {

            for (int i = 1; i <= 19; i++) {
                Task task = new Task();

                int height = task.getRH();
                int width = task.getRW();
                int xCoordinate = task.getRX();
                int yCoordinate = task.getRY();
                int red = task.getRRed();
                int green = task.getRGreen();
                int blue = task.getRBlue();

                System.out.println("Rectangle " + i + ": height = " + height + ";" + " width = " + width + "; x = " + xCoordinate + "; y = " + yCoordinate + "; red = " + red + "; green = " + green + "; blue = " + blue);

                try {
                    Thread.sleep(task.getrTimeShort());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            j++;
        }
    }
}
