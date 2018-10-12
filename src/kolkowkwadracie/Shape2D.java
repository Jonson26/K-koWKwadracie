package kolkowkwadracie;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author VLO
 */
public class Shape2D extends  JPanel{
    public int r;
    private Object Rectangle2D;
    private Object Ellipse2D;
    
    public Shape2D(int R){
        r=R;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g2.setPaint(Color.BLUE);
        g2.draw(new Rectangle2D.Double(0, 0, 2*r, 2*r));
        g2.setPaint(Color.RED);
        g2.draw(new Ellipse2D.Double(0, 0, 2*r, 2*r));
    }
}
