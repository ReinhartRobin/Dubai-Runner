package com.company;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            Var.jump = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_A) {
            Var.left = true;
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            Var.right = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            Var.down = true;

        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W) {
            Var.jump = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            Var.left = false;
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            Var.right = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            Var.down = true;
        }

    }
}



