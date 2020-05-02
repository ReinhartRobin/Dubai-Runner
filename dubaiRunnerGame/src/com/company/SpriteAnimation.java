package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class SpriteAnimation {
    Timer sprite, jumpTime, slideTime;
    private int temp1 = 1;
    private boolean temp2 = false;

    public SpriteAnimation() {
        sprite = new Timer();
        jumpTime = new Timer();
        slideTime = new Timer();
        //Sprite-Bild-ändern
        sprite.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (temp1 == 1) {
                    Var.spritePictures = 1;
                    temp1++;
                } else if (temp1 == 2) {
                    Var.spritePictures = 2;
                    temp1++;
                } else if (temp1 == 3) {
                    Var.spritePictures = 3;
                    temp1++;
                } else if (temp1 == 4) {
                    Var.spritePictures = 4;
                    temp1++;
                } else if (temp1 == 5) {
                    Var.spritePictures = 5;
                    temp1++;
                } else if (temp1 == 6) {
                    Var.spritePictures = 6;
                    temp1++;
                } else if (temp1 == 7) {
                    Var.spritePictures = 7;
                    temp1++;
                } else if (temp1 == 8) {
                    Var.spritePictures = 8;
                    temp1 = 1;
                }
            }

        }, 0, 100);


        //Sprung-Bild-ändern
        jumpTime.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (Var.jumpcnt < 0 && Var.py < Var.ground) {
                    Var.jumpPictures = 0;

                } else if (Var.jumpcnt >= 0) {
                    Var.jumpPictures = 1;
                }
            }
        }, 0, 10);


    }

}
