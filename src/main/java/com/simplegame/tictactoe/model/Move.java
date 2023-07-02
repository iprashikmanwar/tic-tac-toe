package com.simplegame.tictactoe.model;

public class Move {
    Player moveByPlayer;
    Position position;

    public Move(Player moveByPlayer, Position position) {
        this.moveByPlayer = moveByPlayer;
        this.position = position;
    }

    public Player getMoveByPlayer() {
        return moveByPlayer;
    }

    public void setMoveByPlayer(Player moveByPlayer) {
        this.moveByPlayer = moveByPlayer;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
