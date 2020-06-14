package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class ItemsKollision {
    Timer kollision;
    private int temp = 0;
    private int cnt = 0;

    public ItemsKollision() {
        kollision = new Timer();
        kollision.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (temp == 0) {
                    if ((Var.px < Var.shoeX + 75 && Var.px > Var.shoeX || Var.px + 95 > Var.shoeX && Var.px + 95 < Var.shoeX + 75) && (Var.py > Var.shoeY && Var.py < Var.shoeY + 75 || Var.py + 145 > Var.shoeY && Var.py + 145 < Var.shoeY + 75) || (Var.py + 72 > Var.shoeY && Var.py + 72 < Var.shoeY + 75) && (Var.px < Var.shoeX + 75 && Var.px > Var.shoeX || Var.px + 95 > Var.shoeX && Var.px + 95 < Var.shoeX + 75)) {
                        Var.shoeX = Var.screenWidth + (int) (Math.random() * (5000 - 4500) + 4500);
                        Var.shoeY = (Var.screenHeight / 2);
                        Var.speed += 4.5;
                        Var.kollidiert = true;
                        temp++;
                        cnt++;
                    }
                }

                if (temp >= 1 && temp <= 65) {
                    temp++;
                } else if (temp == 66) {
                    temp = 0;
                }

                if (cnt >= 1 && cnt <= 699) {
                    cnt++;
                } else if (cnt == 700) {
                    cnt = 0;
                    Var.speed = 3;
                }
            }
        }, 0, 5);
    }

}
