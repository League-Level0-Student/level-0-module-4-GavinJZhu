package _99_extra.pin_the_tail;

import processing.core.PApplet;
import processing.core.PImage;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class PinTheTail extends PApplet {
    static final int WIDTH = 166;
    static final int HEIGHT = 303;
    PImage donkey;
    PImage tail;
    int tailX = 0;
    int tailY = 0;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
        donkey = loadImage("/Users/league/git/level-0-module-4-GavinJZhu/src/_99_extra/pin_the_tail/donkey.jpg");
       tail = loadImage("/Users/league/git/level-0-module-4-GavinJZhu/src/_99_extra/pin_the_tail/tail3.png");
        tail.resize(60, 30);


    }

    @Override
    public void draw() {
    	
     if(isInsideCBB()){
         drawDonkey();
     }
     else {
         drawColor();
     }
        drawTail();
        rect(0, 0, 30, 30);
        rect(123,240,40,40);
        if (mousePressed) {
                rect(mouseX,mouseY,15,15);
            println(mouseX+", "+mouseY);
            tailX = mouseX;
            tailY = mouseY;
       }
    }

    static public void main(String[] args) {
        PApplet.main(PinTheTail.class.getName());
    }
    public void drawTail(){
        image(tail, tailX, tailY);
    }
    public void drawDonkey(){
        background(donkey);
    }
    public void drawColor(){
        background(196,196,196);
    }
    public boolean isInsideCBB(){
        boolean inside = false;
        float temp = dist(0,0,mouseX,mouseY);
        if (temp < 30){
            inside = true;
        }
        return inside;
    }


    /*********************** DO NOT MODIFY THE CODE BELOW ********************/

    Clip clip = null;

    public void playDoh() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-doh.wav");
        }
    }

    public void playWhoohoo() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-woohoo.wav");
        }
    }

    public Clip getSong(String fileName) {
        String path = "src/";
        Clip clip = null;

        // Note: use .wav files
        try {
            clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path + fileName));
            clip.open(inputStream);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " for " + path + fileName);
        }

        return clip;
    }

    public Clip playSound(String fileName) {
        final Clip clip = getSong(fileName);

        new Thread(new Runnable() {
            @Override
            public void run() {
                clip.start();
            }
        }).start();

        return clip;
    }
}
