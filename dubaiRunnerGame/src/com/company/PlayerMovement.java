package com.company;

import org.w3c.dom.css.CSSRuleList;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
    Timer movement, jumpTimer;
    int cnt = 0;

    public PlayerMovement() {
        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // BEWEGUNG NACH RECHTS
                if (Var.right && !Var.down) {
                    if (Var.px < 1370) {
                        Var.px += Var.speed;
                    }

                    if (Var.jump) {
                        Var.py = (int) Math.round(200 + 0.5 * (Math.pow(Var.jumpcnt, 2)));
                        if (Var.jumpcnt + 0.05 > 29.5) {
                            Var.jump = false;
                            Var.jumpcnt = -28.284;
                        } else {
                            Var.jumpcnt += 0.4;
                        }
                    }


                    Var.score++;
                }
                // BEWEGUNG NACH LINKS
                else if (Var.left && !Var.down) {

                    if (Var.px > 100) {
                        Var.px -= Var.speed;
                    }

                    if (Var.jump) {
                        Var.py = (int) Math.round(200 + 0.5 * (Math.pow(Var.jumpcnt, 2)));
                        if (Var.jumpcnt + 0.05 > 29.5) {
                            Var.jump = false;
                            Var.jumpcnt = -28.284;
                        } else {
                            Var.jumpcnt += 0.4;
                        }
                    }


                    Var.score--;
                    // SPRUNG WÄHREND DES STILL STEHENS
                } else if (Var.jump) {
                    Var.py = (int) Math.round(200 + 0.5 * (Math.pow(Var.jumpcnt, 2)));
                    if (Var.jumpcnt + 0.05 > 29.5) {
                        Var.jump = false;
                        Var.jumpcnt = -28.284;
                    } else {
                        Var.jumpcnt += 0.4;
                    }


                    // SLIDEN / RUTSCHEN
                } else if (Var.down && !Var.jump) {

                    //rechts
                    if (Var.check) {

                        if (cnt > 350) {
                            Var.down = false;
                            cnt = 0;

                        } else {
                            if (Var.px < 1370) {
                                Var.px += Var.slidecnt;
                            }
                            cnt += Var.slidecnt;

                        }
                        Var.score++;
                    }

                    //links
                    if (!Var.check) {

                        if (cnt > 350) {
                            Var.down = false;
                            cnt = 0;

                        } else {
                            if (Var.px > 100) {
                                Var.px -= Var.slidecnt;
                            }
                            cnt += Var.slidecnt;

                        }
                        Var.score--;
                    }
                }
            }

        }, 0, 10);
    }
}
