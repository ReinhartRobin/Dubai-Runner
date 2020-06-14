package com.company;
import java.util.Timer;
import java.util.TimerTask;
public class ItemsMovement {
    Timer movement, position;
    private int temp = 0;
    private boolean check =false;

    public ItemsMovement() {





        if (!check && (Var.score/10) > 500 && (Var.score/10) <= 1000) {
            for (int i = 0; i < 1; i++) {
                Var.shoeSpeed++;
            }
            this.check = true;


        }

        if (check && (Var.score/10) > 1000 && (Var.score/10) <= 1500) {
            for (int i = 0; i < 1; i++) {
                Var.shoeSpeed++;
            }
            this.check = false;


        }

        if (!check && (Var.score/10) > 1500 && (Var.score/10) <= 2000) {
            for (int i = 0; i < 1; i++) {
                Var.shoeSpeed++;
            }
            this.check = true;


        }

        if (check && (Var.score/10) > 2000) {
            for (int i = 0; i < 1; i++) {
                Var.shoeSpeed++;
            }
            this.check = false;


        }





        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                    Var.blick = true;
                    Var.shoeX -= Var.shoeSpeed;
                    if (Var.shoeX < 0) {
                            Var.shoeX = Var.screenWidth + (int) (Math.random() * (5000 - 4500) + 4500);
                            Var.shoeY = (int) (Math.random() * ((750) - 200) + 200);
                }




            }
        }, 0, 9);


    }
}
