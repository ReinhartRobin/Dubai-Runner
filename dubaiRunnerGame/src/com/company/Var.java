package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

public class Var {

    //Screen
    static JFrame jf1;
    static int screenWidth = 1600, screenHeight = 900;
    static int backgroundX1 = 0, backgroundX2 = 1600, backgroundX3 = -1600, backgroundSpeed = 8;
    static boolean ready = false;
    static boolean start = true;

    //Player
    static int px = 500, py = 640;
    static int ground = 640;
    static int speed = 3;
    static boolean jump = false, down = false, left = false, right = false;
    static int spritePictures = 1;
    static int jumpPictures = 0;
    static double jumpcnt = -28.284, slidecnt = 5;
    static boolean check = true;
    static int maxHeight = 440;

    //Gegner
    static int gegnerX[] = new int[6], gegnerY[] = new int[6];
    static int gegnerSpeed[] = new int[6];
    static boolean blick = true;

    //Coins
    static int coinsX[] = new int[5], coinsY[] = new int[5];
    static int coinSpeed[] = new int[5];


    //Score
    static int score = 0;
    static String scoreText = "SCORE: ";

    //Bank
    static int guthaben = 1000;
    static String guthabenText = "BANK: ";

    //Hitbox
    static boolean kollidiert = false, verloren = false;
    static boolean eingesammelt = false;

    //Images
    static BufferedImage ib1, ib2, ib3, ib4, ib5, prinz, igegner1, igegner2, iCoin;
    static String[] imageArray = {
            "rsc/sprite/stand.png",
            "rsc/sprite/1.png",
            "rsc/sprite/2.png",
            "rsc/sprite/3.png",
            "rsc/sprite/4.png",
            "rsc/sprite/5.png",
            "rsc/sprite/6.png",
            "rsc/sprite/7.png",
            "rsc/sprite/8.png"
    };
    static String[] imageArray2 = {
            "rsc/sprite/stand_left.png",
            "rsc/sprite/1_left.png",
            "rsc/sprite/2_left.png",
            "rsc/sprite/3_left.png",
            "rsc/sprite/4_left.png",
            "rsc/sprite/5_left.png",
            "rsc/sprite/6_left.png",
            "rsc/sprite/7_left.png",
            "rsc/sprite/8_left.png",
    };

    static String[] imageArrayJump1 = {
            "rsc/sprite/jump2.png",
            "rsc/sprite/jump3.png",
    };

    static String[] imageArrayJump2 = {
            "rsc/sprite/jump2_left.png",
            "rsc/sprite/jump3_left.png",
    };


    //Score
    static Font scoreFont = new Font("Agency FB", Font.BOLD, 40);
    static Font scoreFont2 = new Font("Agency FB", Font.BOLD, 50);


    //Label
    static Label lbl1;
    static LabelSprite lblMarcus;
    static LabelEnemy lblEnemy;
    static LabelCoin lblCoin;


    //Methode
    public Var() {

        try {
            //Background
            ib1 = ImageIO.read(new File("rsc/b1.jpg"));
            ib2 = ImageIO.read(new File("rsc/b1.jpg"));
            ib3 = ImageIO.read(new File("rsc/b1.jpg"));
            ib4 = ImageIO.read(new File("rsc/death.jpg"));
            ib5 = ImageIO.read(new File("rsc/start.jpg"));
            //Player
            prinz = ImageIO.read(new File("rsc/sprite/stand.png"));
            //Gegner
            igegner1 = ImageIO.read(new File("rsc/gegner1.png"));
            igegner2 = ImageIO.read(new File("rsc/gegner2.png"));
            //Coins
            iCoin = ImageIO.read(new File("rsc/coin.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Bilder konnten nicht geladen werden.");
        }
        //Gegner
        gegnerSpeed[0] = 3;
        gegnerSpeed[1] = 4;
        gegnerSpeed[2] = 3;
        gegnerSpeed[3] = 3;
        gegnerSpeed[4] = 4;
        gegnerSpeed[5] = 3;

        //Coins
        coinSpeed[0] = 3;
        coinSpeed[1] = 4;
        coinSpeed[2] = 3;
        coinSpeed[3] = 3;
        coinSpeed[4] = 4;

    }


}
