package com.simplegame.tictactoe.model;

public enum Position {
    P1(1,1),
    P2(1,2),
    P3(1,3),
    P4(2,1),
    P5(2,2),
    P6(2,3),
    P7(3,1),
    P8(3,2),
    P9(3,3);

    public final int row;
    public final int col;
    private Position(int row, int col){
        this.row = row;
        this.col = col;
    }
}
