package com.company;

import javax.swing.*;
import java.awt.*;

import static java.lang.Math.round;

public class Label extends JLabel {

    protected void paintComponent(Graphics g) {



            String temp = "" + (Math.round(Var.score/10));
            String temp2 = "" + Var.guthaben;
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        if (!Var.start) {

            if (Var.guthaben <= 0){
                Var.right = false;
                Var.left = false;
                g.drawImage(Var.ib4, 0, 0, 1600, 900, null);
                g.setFont(Var.scoreFont2);
                g.setColor(Color.black);
                g.drawString("You scored " + temp, 300, 700);
                Var.ready = true;



            }else{
                //Background
                g.drawImage(Var.ib1, Var.backgroundX1, 0, Var.screenWidth, Var.screenHeight, null);
                g.drawImage(Var.ib2, Var.backgroundX2, 0, Var.screenWidth, Var.screenHeight, null);
                g.drawImage(Var.ib3, Var.backgroundX3, 0, Var.screenWidth, Var.screenHeight, null);

                //Score
                g.setFont(Var.scoreFont);
                g.drawString(Var.scoreText, 20, 50);
                g.drawString(temp, 20, 100);

                //Bank
                g.drawString(Var.guthabenText, Var.screenWidth-100, 50);
                if (Var.guthaben > 999){
                    g.drawString(temp2, Var.screenWidth-100, 100);
                }else if (Var.guthaben > 99 && Var.guthaben < 1000){
                    g.drawString(temp2, Var.screenWidth-80, 100);
                }else{
                    g.drawString(temp2, Var.screenWidth-40, 100);
                }
            }


            repaint();

        }else{
            g.drawImage(Var.ib5, 0, 0, 1600, 900, null);
            repaint();
        }

    }
}
