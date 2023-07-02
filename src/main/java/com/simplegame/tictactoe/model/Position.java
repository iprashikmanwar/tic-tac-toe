package com.simplegame.tictactoe.model;

public enum Position {
    P1(0,0),
    P2(0,1),
    P3(0,2),
    P4(1,0),
    P5(1,1),
    P6(1,2),
    P7(2,0),
    P8(2,1),
    P9(2,2);

    public final int row;
    public final int col;
    private Position(int row, int col){
        this.row = row;
        this.col = col;
    }
}
