package com.company;

import javax.swing.*;
import java.awt.*;

public class LabelCoin extends JLabel {

    protected void paintComponent(Graphics g) {


        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

if (!Var.start){
    if (Var.guthaben <= 0){

    }else{
        //Coins
        for (int i = 0; i < 5; i++) {
            g.drawImage(Var.iCoin, Var.coinsX[i], Var.coinsY[i], 43, 56, null);
        }
    }
    repaint();
}else{

}









    }
}
