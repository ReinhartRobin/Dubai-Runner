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

        if (Var.right && !Var.jump) {
            Var.check = true;
            try {
                Var.prinz = ImageIO.read(new File(Var.imageArray[Var.spritePictures]));
                g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (Var.check && Var.jump) {
            if (Var.right) {
                try {
                    Var.prinz = ImageIO.read(new File(Var.imageArrayJump1[Var.jumpPictures]));
                    g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (Var.left) {
                try {
                    Var.prinz = ImageIO.read(new File(Var.imageArrayJump2[Var.jumpPictures]));
                    g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        } else if (Var.left && !Var.jump) {
            Var.check = false;

            try {
                Var.prinz = ImageIO.read(new File(Var.imageArray2[Var.spritePictures]));
                g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (!Var.check && Var.jump) {

            if (Var.left) {
                try {
                    Var.prinz = ImageIO.read(new File(Var.imageArrayJump2[Var.jumpPictures]));
                    g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (Var.right) {
                try {
                    Var.prinz = ImageIO.read(new File(Var.imageArrayJump1[Var.jumpPictures]));
                    g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        } else if (!Var.right && !Var.left) {


            if (Var.check && !Var.jump) {
                try {
                    Var.prinz = ImageIO.read(new File(Var.imageArray[0]));
                    g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (!Var.check && !Var.jump) {
                try {
                    Var.prinz = ImageIO.read(new File(Var.imageArray2[0]));
                    g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!Var.check && Var.jump) {
                try {
                    Var.prinz = ImageIO.read(new File(Var.imageArrayJump2[Var.jumpPictures]));
                    g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (Var.check && Var.jump) {
                try {
                    Var.prinz = ImageIO.read(new File(Var.imageArrayJump1[Var.jumpPictures]));
                    g.drawImage(Var.prinz, Var.px, Var.py, 95, 145, null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }

        repaint();
    }

}
