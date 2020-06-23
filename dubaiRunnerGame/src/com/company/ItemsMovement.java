package com.company;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Bewegt die Items von rechts nach links und bewegt sie durch eine sin-Schwingung von oben nach unten.
 */

public class ItemsMovement {
    Timer movement, position;
    private int temp = 0;
    private boolean check = false;

    public ItemsMovement() {
        if (!check && (Var.score / 10) > 500 && (Var.score / 10) <= 1000) {
            for (int i = 0; i < 1; i++) {
                Var.shoeSpeed++;
            }
            this.check = true;
        }

        if (check && (Var.score / 10) > 1000 && (Var.score / 10) <= 1500) {
            for (int i = 0; i < 1; i++) {
                Var.shoeSpeed++;
            }
            this.check = false;
        }

        if (!check && (Var.score / 10) > 1500 && (Var.score / 10) <= 2000) {
            for (int i = 0; i < 1; i++) {
                Var.shoeSpeed++;
            }
            this.check = true;
        }

        if (check && (Var.score / 10) > 2000) {
            for (int i = 0; i < 1; i++) {
                Var.shoeSpeed++;
            }
            this.check = false;
        }

        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Var.shoeX -= Var.shoeSpeed;
                if (Var.shoeX < 0) {
                    Var.shoeX = Var.screenWidth + (int) (Math.random() * (5000 - 4500) + 4500);
                    Var.shoeY = (Var.screenHeight / 2);
                } else {
                    Var.shoeY = (int) ((Var.screenHeight / 2 - 75) * Math.sin(Var.itemCnt)) + (Var.screenHeight / 2 - 75);
                    if (Var.itemCnt >= 2 * 3.14) {
                        Var.itemCnt = 0;
                    } else {
                        Var.itemCnt += 0.01;
                    }
                }


                Var.watchX -= Var.watchSpeed;
                if (Var.watchX < 0) {
                    Var.watchX = Var.screenWidth + (int) (Math.random() * (5000 - 4500) + 4500);
                    Var.watchY = (Var.screenHeight / 2);
                } else {
                    Var.watchY = (int) ((Var.screenHeight / 2 - 75) * Math.sin(Var.itemCnt)) + (Var.screenHeight / 2 - 75);
                    if (Var.itemCnt >= 2 * 3.14) {
                        Var.itemCnt = 0;
                    } else {
                        Var.itemCnt += 0.01;
                    }
                }


                Var.safeY += Var.safeSpeed;
                if (Var.safeY >= Var.screenHeight) {
                    Var.safeY = -3000;
                    Var.safeX = (int) (Math.random() * ((Var.screenWidth - 300) - 300) + 300);
                }

            }
        }, 0, 9);
    }
}
