import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.JTextArea;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocation(250,250);
        frame.setLayout(new GridLayout());
        JPanel panel = new JPanel();

        frame.add(panel);
        frame.setVisible(true);

        MovingRect rect1 = new MovingRect(panel, 1, 100, 50, 50, Color.GREEN);
        MovingRect rect2 = new MovingRect(panel, 5, 70, 100, 100, Color.MAGENTA);
        MovingRect rect3 = new MovingRect(panel, 15, 30, 150, 10,Color.BLUE);

        rect1.start();
        rect2.start();
        rect3.start();
    }
}