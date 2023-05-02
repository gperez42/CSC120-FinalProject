import java.awt.*;
import javax.swing.JFrame;

public class DisplayImage extends Canvas {

    public void paint(Graphics g) {
        // // breakfast image
        // Toolkit b = Toolkit.getDefaultToolkit();
        // Image bf = b.getImage("somuchbreakfast.jpeg");
        // g.drawImage(bf, 0, 0, this);

        // // music box image
        // Toolkit m = Toolkit.getDefaultToolkit();
        // Image mb = m.getImage("musicbox.webp");
        // g.drawImage(mb, 0, 0, this); 

        // // loving Nathaniel image
        // Toolkit t = Toolkit.getDefaultToolkit();
        // Image i = t.getImage("heart.image.png"); //put the name of the image file in the parentheses or file path
        // g.drawImage(i, 0, 0, this);
        
        // // friendly Nathaniel image
        // Toolkit t2 = Toolkit.getDefaultToolkit();
        // Image i2 = t2.getImage("friendlyNathaniel.jpeg");
        // g.drawImage(i2, 0, 0, this);

        // // evil Nathaniel image
        // Toolkit t3 = Toolkit.getDefaultToolkit();
        // Image i3 = t3.getImage("evilNathaniel.jpeg");
        // g.drawImage(i3, 0, 0, this);

        // breakfast image
        Toolkit t = Toolkit.getDefaultToolkit();
        Image bf = t.getImage("somuchbreakfast.jpeg");
        g.drawImage(bf, 0, 0, this);

        // music box image
        Image mb = t.getImage("musicbox.webp");
        g.drawImage(mb, 0, 0, this); 

        // loving Nathaniel image
        Image i = t.getImage("heart.image.png"); //put the name of the image file in the parentheses or file path
        g.drawImage(i, 0, 0, this);
        
        // friendly Nathaniel image
        Image i2 = t.getImage("friendlyNathaniel.jpeg");
        g.drawImage(i2, 0, 0, this);

        // evil Nathaniel image
        Image i3 = t.getImage("evilNathaniel.jpeg");
        g.drawImage(i3, 0, 0, this);
    }

    public static void main(String[] args) {
        // breakfast image
        DisplayImage breakfastImage = new DisplayImage();
        JFrame morningBreakfast = new JFrame();
        morningBreakfast.add(breakfastImage);
        morningBreakfast.setSize(615, 500);
        morningBreakfast.setVisible(true); 
        // music box image
        DisplayImage musicBoxImage = new DisplayImage();
        JFrame musicBox = new JFrame();
        musicBox.add(musicBoxImage);
        musicBox.setSize(615, 500);
        musicBox.setVisible(true); 
        // loving Nathaniel image
        DisplayImage lovingNathaniel = new DisplayImage();
        JFrame end1 = new JFrame();
        end1.add(lovingNathaniel);
        end1.setSize(175, 300); // put in the size width, height in parentheses
        end1.setVisible(true); 
        // friendly Nathaniel image
        DisplayImage friendlyNathaniel = new DisplayImage();
        JFrame end2 = new JFrame();
        end2.add(friendlyNathaniel);
        end2.setSize(350, 300);
        end2.setVisible(true); 
        // evil Nathaniel image
        DisplayImage evilNathaniel = new DisplayImage();
        JFrame end3 = new JFrame();
        end3.add(evilNathaniel);
        end3.setSize(800, 700);
        end3.setVisible(true); 
    

    }


}