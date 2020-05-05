package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class CoinKollision {
    Timer movement;
    private int temp = 0;

    public CoinKollision() {
        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    if (temp == 0) {

                        //56
                        if ((Var.px < Var.coinsX[i] + 43 && Var.px > Var.coinsX[i] || Var.px + 95 > Var.coinsX[i] && Var.px + 95 < Var.coinsX[i] + 43) && (Var.py > Var.coinsY[i] && Var.py < Var.coinsY[i] + 56 || Var.py + 145 > Var.coinsY[i] && Var.py + 145 < Var.coinsY[i] + 56) || (Var.py + 72 > Var.coinsY[i] && Var.py + 72 < Var.coinsY[i] + 56) && (Var.px < Var.coinsX[i] + 43 && Var.px > Var.coinsX[i] || Var.px + 95 > Var.coinsX[i] && Var.px + 95 < Var.coinsX[i] + 43)) {
                            Var.eingesammelt = true;


                                Var.coinsX[i] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                                Var.coinsY[i] = -100;


                            if (Var.guthaben > 0) {
                                Var.verloren = false;
                                Var.guthaben+=50;
                            } else if (Var.guthaben <= 0) {
                                Var.verloren = true;
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
