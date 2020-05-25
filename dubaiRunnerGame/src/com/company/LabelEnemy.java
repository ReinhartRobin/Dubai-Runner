package com.company;

import javax.swing.*;
import java.awt.*;

public class LabelEnemy extends JLabel {

    protected void paintComponent(Graphics g) {


        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
if (!Var.start){
    if (Var.guthaben <= 0){

    }else{
        //Gegner
        for (int i = 0; i < 5; i++) {
            g.drawImage(Var.igegner1, Var.gegnerX[i], Var.gegnerY[i], 75, 75, null);
        }

        g.drawImage(Var.igegner2, Var.gegnerX[5], Var.gegnerY[5], 75, 75, null);
    }
    repaint();
}else{

}








    }
}
