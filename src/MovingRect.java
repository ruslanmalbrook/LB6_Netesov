import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class MovingRect extends Thread {
    private JPanel panel;
    private int step, size, x0, y0;
    private Color color;
    private boolean isMoving = true;

    public MovingRect(JPanel panel, int step, int size, int x0, int y0, Color color) {
        super();
        this.panel = panel;
        this.step = step;
        this.size = size;
        this.x0 = x0;
        this.y0 = y0;
        this.color = color;
    }

    @Override
    public void run() {
        int x = x0; int y = y0; int xVector = 1; int yVector = 1;

        Graphics gr = panel.getGraphics();

        panel.setBackground(Color.WHITE);

        while(isMoving) {
            gr.setColor(color);
            gr.fillRect(x,y,size,size);

            try { Thread.sleep(50); }
            catch (InterruptedException e) { e.printStackTrace(); }

            if(x > panel.getWidth() - size) { xVector = -1;}
            if(x < size) { xVector = 1;}
            if(y > panel.getHeight() - size) { yVector = -1;}
            if(y < size) { yVector = 1;}

            x += xVector * step;  y += yVector * step;
        }
    }
}