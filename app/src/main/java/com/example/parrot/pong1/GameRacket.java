package com.example.parrot.pong1;

public class GameRacket {

    int racketX;
    int racketY;

    public GameRacket(int racketX, int racketY) {
        this.racketX = racketX;
        this.racketY = racketY;
    }

    public int getRacketX() {
        return racketX;
    }

    public void setRacketX(int racketX) {
        this.racketX = racketX;
    }

    public int getRacketY() {
        return racketY;
    }

    public void setRacketY(int racketY) {
        this.racketY = racketY;
    }
}
