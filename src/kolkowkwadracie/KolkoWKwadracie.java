package kolkowkwadracie;

import java.awt.Graphics2D;
import javax.swing.*;
import java.io.*;

public class KolkoWKwadracie {
    JFrame ramka;
    
    public static void main(String[] args) {
        KolkoWKwadracie k = new KolkoWKwadracie();
        k.Draw();
    }
    
    public void Draw(){
        int radius;
        ramka = new JFrame();
        radius = Integer.parseInt(JOptionPane.showInputDialog(ramka, "Radius:"));
        ramka.add(new Shape2D(radius));
        ramka.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setVisible(true);
    }
}
