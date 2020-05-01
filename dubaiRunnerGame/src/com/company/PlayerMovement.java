package com.company;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
    Timer movement, jumpTimer;
    boolean elia = true;
    public PlayerMovement() {
        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (Var.right) {
                    if (Var.px <= 1370) {
                        Var.px += Var.speed;
                    }

                    if (Var.jump) {
                        Var.py = (int) Math.round(200 + 0.5 * (Math.pow(Var.jumpcnt, 2)));
                        if (Var.jumpcnt + 0.05 > 29.5) {
                            Var.jump = false;
                            Var.jumpcnt = -28.284;
                        } else {
                            Var.jumpcnt+= 0.4;
                        }
                    }

                    Var.score++;
                } else if (Var.left) {
                    if (Var.px > 100) {
                        Var.px -= Var.speed;
                    }

                    if (Var.jump) {
                        Var.py = (int) Math.round(200 + 0.5 * (Math.pow(Var.jumpcnt, 2)));
                        if (Var.jumpcnt + 0.05 > 29.5) {
                            Var.jump = false;
                            Var.jumpcnt = -28.284;
                        } else {
                            Var.jumpcnt+= 0.4;
                        }
                    }

                    Var.score--;
                } else if (Var.jump) {
                    Var.py = (int) Math.round(200 + 0.5 * (Math.pow(Var.jumpcnt, 2)));
                    if (Var.jumpcnt + 0.05 > 29.5) {
                        Var.jump = false;
                        Var.jumpcnt = -28.284;
                    } else {
                        Var.jumpcnt+= 0.4;
                    }
                }
            }
        }, 0, 10);
    }
}
