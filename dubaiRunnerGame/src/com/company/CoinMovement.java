package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class CoinMovement {
    Timer movement;
    private int temp = 0;

    public CoinMovement() {
        for (int i = 0; i < 5; i++) {
            Var.coinsX[i] = (int) (Math.random() * ((Var.screenWidth - 100) - 100) + 100);
            Var.coinsY[i] = -200 - temp;
            temp += 180;
        }

        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    Var.coinsY[i] += Var.coinSpeed[i];
                    if (Var.coinsY[i] >= Var.screenHeight) {
                        Var.coinsY[i] = -350;
                        Var.coinsX[i] = (int) (Math.random() * ((Var.screenWidth - 100) - 100) + 100);
                    }
                }
            }


        }, 0, 9);
    }
}
