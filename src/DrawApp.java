import java.awt.*;
import javax.swing.*;

// Implement timely refreshes, how? ScheduledExecutorService, Swing Timer,
// Threads?

public class DrawApp extends Canvas{

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new DrawApp(); // correct with this command i also
        // initiate 'paint'?
        canvas.setSize(900, 900);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    // move the paint to its own class? keep the loop in the main?
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; // this opens up 2D attributes like pen,
        // fill, clip, font, etc. Not used so far (10.11.21)



        // rectangles
//        int j = 1;
//        while (j < 99) {
//            g.clearRect(0, 0, getWidth(), getHeight());
//            for (int i = 1; i <= 19; i++) {
//                Task task = new Task();
//                Color randomColor = new Color(task.getRRed(), task.getRGreen(), task.getRBlue());
//                g.setColor(randomColor);
//                g.fillRect(task.getRX(), task.getRY(), task.getRW(), task.getRH());
//                try {
//                    Thread.sleep(task.getrTimeShort());
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            j++;
//        }
    }
}

