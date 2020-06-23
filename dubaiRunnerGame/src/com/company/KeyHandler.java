package com.company;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Wertet Tastatureingaben aus
 */

public class KeyHandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W && !Var.ready) {
            Var.jump = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_A && !Var.ready) {
            Var.left = true;
        } else if (e.getKeyCode() == KeyEvent.VK_D && !Var.ready) {
            Var.right = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_S && !Var.ready) {
            Var.down = true;

        }
        if (e.getKeyCode() == KeyEvent.VK_ENTER && Var.guthaben <= 0 && Var.ready) {

            Var.shoeX = Var.screenWidth + (int) (Math.random() * (6000 - 4500) + 4500);
            Var.shoeY = (Var.screenHeight / 2);
            Var.watchX = Var.screenWidth + (int) (Math.random() * (4000 - 3500) + 3500);
            Var.watchY = (Var.screenHeight / 2);
            Var.safeX = (int) (Math.random() * ((Var.screenWidth - 300) - 300) + 300);
            Var.safeY = (int) (Math.random() * ((-100 - 200) - 200)) - 2000;
            Var.score = 0;
            Var.guthaben = 1000;
            Var.px = 500;
            Var.py = 640;
            for (int i = 0; i < Var.gegnerX.length; i++) {
                if (i < 3) {
                    Var.gegnerX[i] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                } else if (i == 3 || i == 4) {
                    Var.gegnerX[i] = -75 - (int) (Math.random() * (100 - 1) + 1);
                } else {
                    Var.gegnerX[i] = -4000 - (int) (Math.random() * (100 - 1) + 1);
                }
            }
            for (int i = 0; i < Var.coinsX.length; i++) {
                Var.coinsY[i] = (int) (Math.random() * ((-300 - (-500))) - 500);
                Var.coinsX[i] = (int) (Math.random() * ((Var.screenWidth - 100) - 100) + 100);
            }
            Var.ready = false;
            Var.music = true;

        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE && Var.start) {

            Var.score = 0;
            Var.guthaben = 1000;
            Var.px = 500;
            Var.py = 640;
            Var.shoeX = Var.screenWidth + (int) (Math.random() * (6000 - 4500) + 4500);
            Var.shoeY = (Var.screenHeight / 2);
            Var.watchX = Var.screenWidth + (int) (Math.random() * (4000 - 3500) + 3500);
            Var.watchY = (Var.screenHeight / 2);
            Var.safeX = (int) (Math.random() * ((Var.screenWidth - 300) - 300) + 300);
            Var.safeY = (int) (Math.random() * ((-100 - 200) - 200)) - 2000;
            for (int i = 0; i < Var.gegnerX.length; i++) {
                if (i < 3) {
                    Var.gegnerX[i] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                } else if (i == 3 || i == 4) {
                    Var.gegnerX[i] = -75 - (int) (Math.random() * (100 - 1) + 1);
                } else {
                    Var.gegnerX[i] = -4000 - (int) (Math.random() * (100 - 1) + 1);
                }
            }
            for (int i = 0; i < Var.coinsX.length; i++) {
                Var.coinsY[i] = (int) (Math.random() * ((-300 - (-500))) - 500);
                Var.coinsX[i] = (int) (Math.random() * ((Var.screenWidth - 100) - 100) + 100);
            }
            Var.start = false;
            Var.music = true;


        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W && !Var.ready) {
            Var.jump = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_A && !Var.ready) {
            Var.left = false;
        } else if (e.getKeyCode() == KeyEvent.VK_D && !Var.ready) {
            Var.right = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_S && !Var.ready) {
            Var.down = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_ENTER && Var.guthaben <= 0 && Var.ready) {

            Var.shoeX = Var.screenWidth + (int) (Math.random() * (6000 - 4500) + 4500);
            Var.shoeY = (Var.screenHeight / 2);
            Var.watchX = Var.screenWidth + (int) (Math.random() * (4000 - 3500) + 3500);
            Var.watchY = (Var.screenHeight / 2);
            Var.safeX = (int) (Math.random() * ((Var.screenWidth - 300) - 300) + 300);
            Var.safeY = (int) (Math.random() * ((-100 - 200) - 200)) - 2000;
            Var.score = 0;
            Var.guthaben = 1000;
            Var.px = 500;
            Var.py = 640;

            for (int i = 0; i < Var.gegnerX.length; i++) {
                if (i < 3) {
                    Var.gegnerX[i] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                } else if (i == 3 || i == 4) {
                    Var.gegnerX[i] = -75 - (int) (Math.random() * (100 - 1) + 1);
                } else {
                    Var.gegnerX[i] = -4000 - (int) (Math.random() * (100 - 1) + 1);
                }
            }
            for (int i = 0; i < Var.coinsX.length; i++) {
                Var.coinsY[i] = (int) (Math.random() * ((-300 - (-500))) - 500);
                Var.coinsX[i] = (int) (Math.random() * ((Var.screenWidth - 100) - 100) + 100);
            }
            Var.ready = false;
            Var.music = true;


        }
    }
}



