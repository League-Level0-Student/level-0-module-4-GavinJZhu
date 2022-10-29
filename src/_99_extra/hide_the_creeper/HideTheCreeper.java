package _99_extra.hide_the_creeper;

import processing.core.PApplet;
import processing.core.PImage;

import javax.swing.*;

public class HideTheCreeper extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
PImage creeper;
    int x=40;
    int y=75;
    @Override
    public void setup() {
         PImage green = loadImage("C:\\Users\\Gavin\\git\\level-0-module-4-GavinJZhu\\images\\green.jpg");
         green.resize(WIDTH, HEIGHT);
         background(green);
         creeper=loadImage("C:\\Users\\Gavin\\git\\level-0-module-4-GavinJZhu\\images\\creeper.png");
         creeper.resize(5,10);
    }

    @Override
    public void draw() {
        image(creeper, x, y);
        if (mousePressed){
            if(mouseX >= 37 && mouseX <= 47 && mouseY >= 74 && mouseY <= 86){
                JOptionPane.showMessageDialog(null,"You found the creeper!");
            }
        }
    }

    static public void main(String[] args) {
        PApplet.main(HideTheCreeper.class.getName());
    }
}
