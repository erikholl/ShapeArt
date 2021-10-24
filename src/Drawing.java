import Shapes.Rectangle;
import java.awt.*;
import javax.swing.JFrame;

public class Drawing extends Canvas{
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(1200, 1200);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        for (int i = 1; i <= 20; i++) {
            Rectangle rect = new Rectangle();
            rect.setHeight(1);
            rect.setWidth(1);
            rect.setXCoordinate(1);
            rect.setYCoordinate(1);
            rect.setRed(1);
            rect.setGreen(1);
            rect.setBlue(1);

            int height = rect.getH();
            int width = rect.getW();
            int xCoordinate = rect.getX();
            int yCoordinate = rect.getY();
            int red = rect.getRed();
            int green = rect.getGreen();
            int blue = rect.getBlue();

            g.fillRect(xCoordinate, yCoordinate, width, height);

            Color randomColor = new Color(red, green, blue);
            g.setColor(randomColor);
        }

    }
}
