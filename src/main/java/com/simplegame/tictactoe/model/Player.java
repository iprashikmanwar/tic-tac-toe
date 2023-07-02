package com.simplegame.tictactoe.model;

public class Player {
    String name;
    int playerMark;

    Player(String name, int playerMark){
        this.name = name;
        this.playerMark = playerMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerMark() {
        return playerMark;
    }

    public void setPlayerMark(int playerMark) {
        this.playerMark = playerMark;
    }
}
