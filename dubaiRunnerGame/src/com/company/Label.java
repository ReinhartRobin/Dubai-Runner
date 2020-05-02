package com.company;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        //Background
        g.drawImage(Var.ib1, Var.backgroundX1, 0, Var.screenWidth, Var.screenHeight, null);
        g.drawImage(Var.ib2, Var.backgroundX2, 0, Var.screenWidth, Var.screenHeight, null);
        g.drawImage(Var.ib3, Var.backgroundX3, 0, Var.screenWidth, Var.screenHeight, null);

        //Score
        g.setFont(Var.scoreFont);
        g.drawString(Var.scoreText + Math.round(Var.score / 10), 20, 50);



        repaint();
    }

}
