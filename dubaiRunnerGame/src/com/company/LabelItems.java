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
                for (int i = 0; i < 1; i++) {
                    g.drawImage(Var.iShoe, Var.shoeX, Var.shoeY, 75, 75, null);
                }
            }
            repaint();
        }else {
        }
    }
}
