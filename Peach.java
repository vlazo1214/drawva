import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Peach extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.setBackground(Color.WHITE);
    Random rand = new Random();
    float red;
    float green;
    float blue;
    int pos_x;
    int pos_y;
    int size;
    int size_max = 50;
    int size_min = 10;

    for (int i = 0; i < 6; i++) {
      red = rand.nextFloat(1);
      green = rand.nextFloat(1);
      blue = rand.nextFloat(1);

      pos_x = rand.nextInt(450);
      pos_y = rand.nextInt(450);
      size = rand.nextInt(size_max - size_min + 1) + size_min;


      g.setColor(new Color(red, green, blue));
      g.fillOval(pos_x, pos_y, size, size);
    }

    // g.setColor(Color.ORANGE);
    // g.fill3DRect(10, 160, 100, 50, true);
    //
    // g.setColor(Color.BLUE);
    // g.drawLine(10, 25, 200, 45);
    //
    // g.setColor(Color.RED);
    // g.drawRect(10, 55, 100, 30);

  }
}
