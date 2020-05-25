package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class GegnerKollision {
    Timer kollision;
    private int temp = 0;

    public GegnerKollision() {
        kollision = new Timer();
        kollision.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    if (temp == 0) {
                        if ((Var.px < Var.gegnerX[i] + 75 && Var.px > Var.gegnerX[i] || Var.px + 95 > Var.gegnerX[i] && Var.px + 95 < Var.gegnerX[i] + 75) && (Var.py > Var.gegnerY[i] && Var.py < Var.gegnerY[i] + 75 || Var.py + 145 > Var.gegnerY[i] && Var.py + 145 < Var.gegnerY[i] + 75) || (Var.py + 72 > Var.gegnerY[i] && Var.py + 72 < Var.gegnerY[i] + 75) && (Var.px < Var.gegnerX[i] + 75 && Var.px > Var.gegnerX[i] || Var.px + 95 > Var.gegnerX[i] && Var.px + 95 < Var.gegnerX[i] + 75)) {

                            Var.kollidiert = true;
                            if (i < 3) {
                                Var.gegnerX[i] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                            } else if (i == 3 || i == 4) {
                                Var.gegnerX[i] = -75 - (int) (Math.random() * (100 - 1) + 1);
                            } else {
                                Var.gegnerX[i] = -4000 - (int) (Math.random() * (100 - 1) + 1);
                            }

                            if (Var.guthaben > 0) {

                                if (i != 5) {
                                    Var.guthaben -= 100;
                                } else {
                                    Var.guthaben -= 1000;
                                }
                            }

                            temp++;

                        }
                    }
                }
                if (temp >= 1 && temp <= 65) {
                    temp++;
                } else if (temp == 66) {
                    temp = 0;
                }

            }
        }, 0, 5);
    }
}
