package com.company;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Überprüft ob die Position des Spielers über der der Items liegt und lässt den Spieler dies einsemmeln, wobei die
 * Position der Items zurückgesetzt wird und der Spieler einen Effekt erhält.
 */

public class ItemsKollision {
    Timer kollision;
    private int temp = 0;
    private int cnt = 0;

    public ItemsKollision() {
        kollision = new Timer();
        kollision.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (temp == 0 && Var.music) {
                    if ((Var.px < Var.shoeX + 75 && Var.px > Var.shoeX || Var.px + 95 > Var.shoeX && Var.px + 95 < Var.shoeX + 75) && (Var.py > Var.shoeY && Var.py < Var.shoeY + 75 || Var.py + 145 > Var.shoeY && Var.py + 145 < Var.shoeY + 75) || (Var.py + 72 > Var.shoeY && Var.py + 72 < Var.shoeY + 75) && (Var.px < Var.shoeX + 75 && Var.px > Var.shoeX || Var.px + 95 > Var.shoeX && Var.px + 95 < Var.shoeX + 75)) {
                        Var.shoeX = Var.screenWidth + (int) (Math.random() * (5000 - 4500) + 4500);
                        Var.shoeY = (Var.screenHeight / 2);
                        Var.speed += 5;
                        Var.kollidiert = true;

                        Musik.sounds("rsc/audio/ichBinSoSchnell.wav");
                        temp++;
                        cnt++;
                    } else if ((Var.px < Var.watchX + 75 && Var.px > Var.watchX || Var.px + 95 > Var.watchX && Var.px + 95 < Var.watchX + 75) && (Var.py > Var.watchY && Var.py < Var.watchY + 75 || Var.py + 145 > Var.watchY && Var.py + 145 < Var.watchY + 75) || (Var.py + 72 > Var.watchY && Var.py + 72 < Var.watchY + 75) && (Var.px < Var.watchX + 75 && Var.px > Var.watchX || Var.px + 95 > Var.watchX && Var.px + 95 < Var.watchX + 75)) {
                        Var.watchX = Var.screenWidth + (int) (Math.random() * (5000 - 4500) + 4500);
                        Var.watchY = (Var.screenHeight / 2);
                        for (int i = 0; i < Var.gegnerX.length; i++) {
                            if (i < 3) {
                                Var.gegnerX[i] = Var.screenWidth + (int) (Math.random() * (400 - 200) + 200);
                            } else if (i == 3 || i == 4) {
                                Var.gegnerX[i] = -75 - (int) (Math.random() * (400 - 200) + 200);
                            } else {
                                Var.gegnerX[i] = -4000 - (int) (Math.random() * (400 - 200) + 200);
                            }
                            Var.kollidiert = true;
                            Musik.sounds("rsc/audio/rolexICE.wav");
                            temp++;
                            cnt++;
                        }
                    } else if ((Var.px < Var.safeX + 43 && Var.px > Var.safeX || Var.px + 95 > Var.safeX && Var.px + 95 < Var.safeX + 43) && (Var.py > Var.safeY && Var.py < Var.safeY + 56 || Var.py + 145 > Var.safeY && Var.py + 145 < Var.safeY + 56) || (Var.py + 72 > Var.safeY && Var.py + 72 < Var.safeY + 56) && (Var.px < Var.safeX + 43 && Var.px > Var.safeX || Var.px + 95 > Var.safeX && Var.px + 95 < Var.safeX + 43)) {
                        Var.eingesammelt = true;
                        Musik.sounds("rsc/audio/ichBinReich.wav");

                        Var.safeX = (int) (Math.random() * ((Var.screenWidth - 300) - 300) + 300);
                        Var.safeY = -3000;


                        if (Var.guthaben > 0) {
                            Var.verloren = false;
                            Var.guthaben += 300;
                        } else if (Var.guthaben <= 0) {
                            Var.verloren = true;
                        }

                        temp++;


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

                if (cnt >= 1 && cnt <= 899) {
                    cnt++;
                } else if (cnt == 900) {
                    cnt = 0;
                    Var.speed = 3;
                }
            }
        }, 0, 5);
    }

}
