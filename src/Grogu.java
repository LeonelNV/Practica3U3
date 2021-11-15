
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonel
 */
public class Grogu extends Canvas{
    int x=50, y=50;
    Image tamagochi=new ImageIcon(getClass().getResource("Grogu.jpg")).getImage();
    
    
    
    
    
    @Override
    public void paint(Graphics g){
    super.paint(g);
    
    Graphics2D g2=(Graphics2D)g;
    
     g2.setColor(Color.white);
     g2.fillOval(50, 30, 80, 80);
    
   // g.drawImage(tamagochi, x, 30, (ImageObserver) this);
    }

    
    
}
