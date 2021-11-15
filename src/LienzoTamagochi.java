
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;



public class LienzoTamagochi extends Canvas{
    Image tamagochi=new ImageIcon(getClass().getResource("Grogu.jpg")).getImage(); 
    int posX=200;
    /*int incremendoLuna=0;
    Copo[]nieve=new Copo[300];*/
    
    Timer movimiento=new Timer(100, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
           posX -=5; 
           if(posX<-200)posX=(int)(Math.random()*200)+200;
            
           repaint();
        }
    });
    
    
    
    public LienzoTamagochi(){
        movimiento.start();
      
    }
    
    @Override
    public void paint(Graphics g){
    super.paint(g); 
    Graphics2D g2=(Graphics2D)g;
 
        g.drawImage(tamagochi, posX,150, this);
        
        
    }
}
