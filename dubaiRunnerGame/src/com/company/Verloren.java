package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Verloren {
    Timer loose;
    private int temp = 0, temp1 = 0, temp2 = 0;

    public Verloren() {
        loose = new Timer();
        loose.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (Var.verloren) {

                    if (temp >= 0 && temp <= 55) {
                        temp++;
                    } else if (temp == 56) {
                        System.out.println("GAME OVER");
                        for (int i = 0; i < 5; i++) {
                            Var.coinsX[i] = (int) (Math.random() * ((Var.screenWidth - 100) - 100) + 100);
                            Var.coinsY[i] = -200 - temp1;
                            temp1 += 180;
                        }

                        for (int i = 0; i <= 4; i++) {
                            Var.gegnerY[i] = 0;
                        }

                        //rechts
                        Var.gegnerX[0] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                        Var.gegnerY[0] = (int) (Math.random() * ((750) - 600) + 600);
                        Var.gegnerX[1] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                        Var.gegnerY[1] = (int) (Math.random() * ((599) - 300) + 300);
                        Var.gegnerX[2] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                        Var.gegnerY[2] = (int) (Math.random() * ((299) - 0) + 0);


                        Var.gegnerX[3] = -75 - (int) (Math.random() * (100 - 1) + 1);
                        Var.gegnerY[3] = (int) (Math.random() * ((750) - 600) + 600);
                        Var.gegnerX[4] = -75 - (int) (Math.random() * (100 - 1) + 1);
                        Var.gegnerY[4] = (int) (Math.random() * ((599) - 300) + 300);
                        Var.gegnerX[5] = -4000 - (int) (Math.random() * (100 - 1) + 1);
                        Var.gegnerY[5] = (int) (Math.random() * ((Var.ground) - 0) + 0);


                        if (!Var.check && (Var.score / 10) > 500 && (Var.score / 10) <= 1000) {
                            for (int i = 0; i < 6; i++) {
                                Var.gegnerSpeed[i]++;
                            }
                            Var.check = true;


                        }

                        if (Var.check && (Var.score / 10) > 1000 && (Var.score / 10) <= 1500) {
                            for (int i = 0; i < 6; i++) {
                                Var.gegnerSpeed[i]++;
                            }
                            Var.check = false;


                        }

                        if (!Var.check && (Var.score / 10) > 1500 && (Var.score / 10) <= 2000) {
                            for (int i = 0; i < 6; i++) {
                                Var.gegnerSpeed[i]++;
                            }
                            Var.check = true;


                        }

                        if (Var.check && (Var.score / 10) > 2000) {
                            for (int i = 0; i < 6; i++) {
                                Var.gegnerSpeed[i]++;
                            }
                            Var.check = false;


                        }
                        temp = 0;
                        if(Var.score >= 50){
                            Var.score -= 50;
                        }else{
                            Var.score =  0;
                        }

                    }
                }
            }


        }, 0, 15);
    }
}