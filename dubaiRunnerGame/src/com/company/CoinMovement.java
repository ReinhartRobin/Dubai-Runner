package com.company;

import java.util.Timer;

public class CoinMovement {
    Timer movement;
    private int temp = 0;

    public CoinMovement() {
        for (int i = 0; i < 5; i++) {
            Var.coinsX[i] = 20+temp;
            Var.coinsY[i] = -200-temp;
        }
    }
}
