import Functionality.Task;
import java.awt.*;
import javax.swing.*;

// Implement timely refreshes, how? ScheduledExecutorService, Swing Timer,
// Threads?

public class DrawApp extends Canvas{

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new DrawApp();
        canvas.setSize(1200, 1200);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    // move the paint to its own class? keep the loop in the main?
    public void paint(Graphics g) {
        for (int i = 1; i <= 20; i++) {
            Task task = new Task();

            Color randomColor = new Color(task.getRRed(), task.getRGreen(), task.getRBlue());
            g.setColor(randomColor);

            g.fillRect(task.getRX(), task.getRY(), task.getRW(), task.getRH());
        }
    }
}

