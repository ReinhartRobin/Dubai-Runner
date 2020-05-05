package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class EnemyMovement {
    Timer movement, position;
    private int temp = 0;
    private boolean check =false;


    public EnemyMovement() {


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




        if (!check && (Var.score/10) > 500 && (Var.score/10) <= 1000) {
            for (int i = 0; i < 6; i++) {
                Var.gegnerSpeed[i]++;
            }
            this.check = true;


        }

        if (check && (Var.score/10) > 1000 && (Var.score/10) <= 1500) {
            for (int i = 0; i < 6; i++) {
                Var.gegnerSpeed[i]++;
            }
            this.check = false;


        }

        if (!check && (Var.score/10) > 1500 && (Var.score/10) <= 2000) {
            for (int i = 0; i < 6; i++) {
                Var.gegnerSpeed[i]++;
            }
            this.check = true;


        }

        if (check && (Var.score/10) > 2000) {
            for (int i = 0; i < 6; i++) {
                Var.gegnerSpeed[i]++;
            }
            this.check = false;


        }





        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {


                for (int i = 0; i < 3; i++) {
                    Var.blick = true;
                    Var.gegnerX[i] -= Var.gegnerSpeed[i];
                    if (Var.gegnerX[i] < 0) {

                        if (i == 0){
                            Var.gegnerX[i] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                            Var.gegnerY[i] = (int) (Math.random() * ((750) - 600) + 600);
                        }else if (i == 2){
                            Var.gegnerX[i] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                            Var.gegnerY[i] = (int) (Math.random() * ((599) - 300) + 300);
                        }else {
                            Var.gegnerX[i] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                            Var.gegnerY[i] = (int) (Math.random() * ((299) - 0) + 0);
                        }


                    }
                }

                for (int i = 3; i < 6; i++) {
                    Var.gegnerX[i] += Var.gegnerSpeed[i];
                    if (Var.gegnerX[i] > Var.screenWidth) {
                        if (i == 3){
                            Var.gegnerX[i] = -75 - (int) (Math.random() * (100 - 1) + 1);
                            Var.gegnerY[i] = (int) (Math.random() * ((750) - 600) + 600);
                        }else if (i == 4){
                            Var.gegnerX[i] = -75 - (int) (Math.random() * (100 - 1) + 1);
                            Var.gegnerY[i] = (int) (Math.random() * ((599) - 300) + 300);
                        }else{
                            Var.gegnerX[i] = -4000 - (int) (Math.random() * (100 - 1) + 1);
                            Var.gegnerY[i] = (int) (Math.random() * ((Var.ground) - 0) + 0);
                        }
                    }
                }
            }
        }, 0, 9);


    }
}
