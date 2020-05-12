package com.company;

import java.util.Timer;
import java.util.TimerTask;
public class Verloren {
    Timer loose;
    private int temp = 0, temp1 = 0;
    public Verloren(){
        loose = new Timer();
        loose.scheduleAtFixedRate(new TimerTask(){
@Override
public void run() {
              if(Var.verloren) if (temp >= 0 && temp <= 55) {
                  temp++;
              } else if (temp == 56) {
                  System.out.println("Verloren");
                  for (int i = 0; i < 5; i++) {
                      Var.coinsX[i] = (int) (Math.random() * ((Var.screenWidth - 100) - 100) + 100);
                      Var.coinsY[i] = -200 - temp;
                      temp += 180;
                  }

              }}}, 0 ,15);
    }
        }