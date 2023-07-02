package com.simplegame.tictactoe.model;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Value;

public class Player {
    @NotNull
    String name;
    //@Value(PlayerMark.unassigned)
    PlayerMark playerMark;

    Player(String name, PlayerMark playerMark){
        this.name = name;
        this.playerMark = playerMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerMark getPlayerMark() {
        return playerMark;
    }

    public void setPlayerMark(PlayerMark playerMark) {
        this.playerMark = playerMark;
    }
}
