package com.company;


import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;

public class Gui {

    public Gui() {

        //Main-Overlay
        Var.jf1 = new JFrame();
        Var.jf1.setSize(Var.screenWidth, Var.screenHeight);
        Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Var.jf1.setLocationRelativeTo(null);
        Var.jf1.setLayout(null);
        Var.jf1.setTitle("Dubai Runner");
        Var.jf1.setResizable(false);
        Var.jf1.addKeyListener(new KeyHandler());
        Var.jf1.requestFocus();
        Var.jf1.setVisible(true);






        //Player
        Var.lblMarcus = new LabelSprite();
        Var.lblMarcus.setBounds(0, 0, Var.screenWidth, Var.screenHeight);
        Var.lblMarcus.setVisible(true);
        Var.jf1.add(Var.lblMarcus);

        //Enemy
        Var.lblEnemy = new LabelEnemy();
        Var.lblEnemy.setBounds(0, 0, Var.screenWidth, Var.screenHeight);
        Var.lblEnemy.setVisible(true);
        Var.jf1.add(Var.lblEnemy);

        //Coins
        Var.lblCoin = new LabelCoin();
        Var.lblCoin.setBounds(0, 0, Var.screenWidth, Var.screenHeight);
        Var.lblCoin.setVisible(true);
        Var.jf1.add(Var.lblCoin);

        //Background
        Var.lbl1 = new Label();
        Var.lbl1.setBounds(0, 0, Var.screenWidth, Var.screenHeight);
        Var.lbl1.setVisible(true);
        Var.jf1.add(Var.lbl1);


    }

}
