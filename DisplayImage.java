import java.awt.*;
import javax.swing.JFrame;

public class DisplayImage extends Canvas { 

    

    public void paint(Graphics g) {
        // ONE LAST IMAGE
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("dark_castle_of_hearts.jpg");  
        g.drawImage(i, 0,0,this);  
    }
      

    // FOR LAST IMAGE
     public static void main(String[] args) {
        DisplayImage heartCastle = new DisplayImage();  
        JFrame hc=new JFrame();  
        hc.add(heartCastle);  
        hc.setSize(512,512);  
        hc.setVisible(true);

    }

}