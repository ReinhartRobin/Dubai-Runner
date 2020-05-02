package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Background {
    Timer back;

    public Background() {
        back = new Timer();
        back.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                //Rechts-Laufen => Bild geht nach links
                if (Var.right && Var.px > 1200) {
                    if (Var.backgroundX1 > -1596) {
                        Var.backgroundX1 -= 2;
                    } else {
                        Var.backgroundX1 = 1600;
                    }
                    if (Var.backgroundX2 > -1596) {
                        Var.backgroundX2 -= 2;
                    } else {
                        Var.backgroundX2 = 1600;
                    }

                    if (Var.backgroundX3 > -1596) {
                        Var.backgroundX3 -= 2;
                    } else {
                        Var.backgroundX3 = 1600;
                    }
                }

                //Links-Laufen => Bild geht nach rechts
                if (Var.left && Var.px < 400) {
                    if (Var.backgroundX1 < 1596) {
                        Var.backgroundX1 += 2;
                    } else {
                        Var.backgroundX1 = -1600;
                    }

                    if (Var.backgroundX2 < 1596) {
                        Var.backgroundX2 += 2;
                    } else {
                        Var.backgroundX2 = -1600;
                    }

                    if (Var.backgroundX3 < 1596) {
                        Var.backgroundX3 += 2;
                    } else {
                        Var.backgroundX3 = -1600;
                    }
                }
            }
        }, 0, Var.backgroundSpeed);
    }

}
