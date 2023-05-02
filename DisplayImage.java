// shows a little heart (maybe we can find a way to put it at the end of our game if the user wins over LoveInterest)

import java.awt.*;
import javax.swing.JFrame;

public class DisplayImage extends Canvas {

    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("heart.image.png"); //put the name of the image file in the parentheses or file path
        g.drawImage(i, 0, 0, this);
    }

    public static void main(String[] args) {
        DisplayImage img = new DisplayImage();
        JFrame f = new JFrame();
        f.add(img);
        f.setSize(175, 300); // put in the size width, height in parentheses
        f.setVisible(true); 
    }


}