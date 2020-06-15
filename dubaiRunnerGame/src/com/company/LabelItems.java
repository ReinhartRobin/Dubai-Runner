package com.company;

import javax.swing.*;
import java.awt.*;

public class LabelItems extends JLabel {

    protected void paintComponent(Graphics g) {


        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (!Var.start) {
            if (Var.guthaben <= 0) {

            } else {
                //Shoe
                g.drawImage(Var.iShoe, Var.shoeX, Var.shoeY, 75, 75, null);
                //Watch
                g.drawImage(Var.iWatch, Var.watchX, Var.watchY, (int) (500 * 0.4), (int) (281 * 0.4), null);
                //Safe
                g.drawImage(Var.iSafe, Var.safeX, Var.safeY, 90, 90, null);
            }
            repaint();
        } else {
        }
    }
}
