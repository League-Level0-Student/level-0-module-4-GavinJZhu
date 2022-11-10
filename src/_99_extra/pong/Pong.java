package _99_extra.pong;

import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 0;
    int xSpeed = 7;
    int y = 300;
    int ySpeed = 9;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    background(0,0,0);
    	ellipse(x,y,20,20);
    	fill(255,0,0);
    	stroke(255,0,0);
    	x = x+xSpeed;
    	y = y+ySpeed;
    	if (x > WIDTH) {
    		xSpeed = -xSpeed;
    	}
    	else if(x < 0) {
    		xSpeed = -xSpeed;
    	}
    	if (y > HEIGHT) {
    		ySpeed = -ySpeed;
    	}
    	else if(y < 0) {
    		ySpeed = -ySpeed;
    	}
    	rect (mouseX,570,120,40);
    	if (intersects(x, y, mouseX, 570, 120)) {
    		ySpeed = -ySpeed;
    	}
    	
    }
    boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
	    if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
	        return true;
	    else
	        return false;
	}
    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}