package com.company;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
        if (e.getKeyCode() == KeyEvent.VK_ENTER && Var.guthaben <= 0){


                Var.score = 0;
                Var.guthaben = 1000;
                Var.px = 500;
                Var.py = 640;
                Var.ready = false;

        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE && Var.start){
            Var.start = false;
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W  && !Var.ready) {
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
        if (e.getKeyCode() == KeyEvent.VK_ENTER && Var.guthaben <= 0 && Var.ready){

            System.out.println("MardnLP");
            Var.score = 0;
            Var.guthaben = 1000;
            Var.px = 500;
            Var.py = 640;
            Var.ready = false;
        }

    }
}



