package com.example.parrot.pong1;

public class GameBall {

    int ballX;
    int ballY;


    public GameBall(int ballX, int ballY) {
        this.ballX = ballX;
        this.ballY = ballY;
    }

    public int getBallX() {
        return ballX;
    }

    public void setBallX(int ballX) {
        this.ballX = ballX;
    }

    public int getBallY() {
        return ballY;
    }

    public void setBallY(int ballY) {
        this.ballY = ballY;
    }
}
