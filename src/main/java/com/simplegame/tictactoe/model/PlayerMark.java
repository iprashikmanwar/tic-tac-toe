package com.simplegame.tictactoe.model;

public enum PlayerMark {

    X(1),
    O(-1),
    unassigned(0);

    public final int mark;

    private PlayerMark(int mark){
        this.mark = mark;
    }
}
