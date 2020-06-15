package com.company;

import javax.sound.sampled.*;
import java.io.File;

public class Musik {
    public static synchronized void music(String track) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Clip clip = AudioSystem.getClip();
                        AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(track));
                        clip.open(inputStream);
                        clip.loop(clip.LOOP_CONTINUOUSLY);


                        Thread.sleep(clip.getMicrosecondLength() / 1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public static synchronized void sounds(String track) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(track));
                    clip.open(inputStream);
                    clip.start();
                    Thread.sleep(clip.getMicrosecondLength());
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }

}
