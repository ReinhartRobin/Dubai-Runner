package com.company;

import javax.swing.*;
import java.awt.*;

public class LabelEnemy extends JLabel {

    protected void paintComponent(Graphics g) {


        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        //Gegner
        for (int i = 0; i < 6; i++) {
            g.drawImage(Var.igegner1, Var.gegnerX[i], Var.gegnerY[i], 75, 75, null);
        }






        repaint();
    }
}
