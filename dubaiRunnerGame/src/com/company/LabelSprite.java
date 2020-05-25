package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class LabelSprite extends JLabel {

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (!Var.start){
            if (Var.guthaben <= 0){

            }else{
                //Rechts-Laufen
                if (Var.right && !Var.jump && !Var.down) {
                    Var.check = true;
                    try {
                        Var.prinz = ImageIO.read(new File(Var.imageArray[Var.spritePictures]));
                        g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } else if (Var.right && !Var.jump && Var.down) { //Rechts-Sliden
                    try {
                        Var.prinz = ImageIO.read(new File("rsc/sprite/slide2.png"));
                        g.drawImage(Var.prinz, Var.px, Var.py + 55, 147, 100, null);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } else if (Var.check && Var.jump) { //Blick Rechts Sprung

                    //Richtung Sprung rechts
                    if (Var.right) {
                        try {
                            Var.prinz = ImageIO.read(new File(Var.imageArrayJump1[Var.jumpPictures]));
                            g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else if (Var.left) { //Richtung Sprung links
                        try {
                            Var.prinz = ImageIO.read(new File(Var.imageArrayJump2[Var.jumpPictures]));
                            g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else { //Rechts-Blick - Sprung
                        try {
                            Var.prinz = ImageIO.read(new File(Var.imageArrayJump1[Var.jumpPictures]));
                            g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }


                } else if (Var.left && !Var.jump && !Var.down) { //Links-laufen
                    Var.check = false;

                    try {
                        Var.prinz = ImageIO.read(new File(Var.imageArray2[Var.spritePictures]));
                        g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } else if (Var.left && !Var.jump && Var.down) { //Links-Sliden


                    try {
                        Var.prinz = ImageIO.read(new File("rsc/sprite/slide2_left.png"));
                        g.drawImage(Var.prinz, Var.px, Var.py + 55, 147, 100, null);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                } else if (!Var.check && Var.jump) { //Sprung - Blick nach links


                    if (Var.left) { //Richtung Sprung links
                        try {
                            Var.prinz = ImageIO.read(new File(Var.imageArrayJump2[Var.jumpPictures]));
                            g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else if (Var.right) {//Richtung Sprung rechts
                        try {
                            Var.prinz = ImageIO.read(new File(Var.imageArrayJump1[Var.jumpPictures]));
                            g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else { //Sprung Blick links
                        try {
                            Var.prinz = ImageIO.read(new File(Var.imageArrayJump2[Var.jumpPictures]));
                            g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }


                } else if (Var.down && !Var.jump) { //Sliden

                    if (Var.check || Var.right) { //  rechts
                        try {
                            Var.prinz = ImageIO.read(new File("rsc/sprite/slide2.png"));
                            g.drawImage(Var.prinz, Var.px, Var.py + 55, 147, 100, null);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (!Var.check || Var.left) { //links
                        try {
                            Var.prinz = ImageIO.read(new File("rsc/sprite/slide2_left.png"));
                            g.drawImage(Var.prinz, Var.px, Var.py + 55, 147, 100, null);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }


                } else if (!Var.right && !Var.left) {


                    if (Var.check) { // stehen Blick rechts
                        try {
                            Var.prinz = ImageIO.read(new File(Var.imageArray[0]));
                            g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else if (!Var.check) { // stehen Blick links
                        try {
                            Var.prinz = ImageIO.read(new File(Var.imageArray2[0]));
                            g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }



                }
            }
            repaint();
        }else{

        }




    }

}
