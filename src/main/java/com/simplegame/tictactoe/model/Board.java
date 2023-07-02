package com.simplegame.tictactoe.model;

import java.util.Arrays;
import java.util.List;

import static com.simplegame.tictactoe.model.PlayerMark.unassigned;

public class Board {
    List<Move> moveList;
    int field[][] = new int[3][3];

    public Board(){};

    public void init(){
        Arrays.fill(field[0],0);
        Arrays.fill(field[1],0);
        Arrays.fill(field[2],0);
    }

    public void showBoard(){
        System.out.println("\n\t\t\t "+field[0][0]+" | "+field[0][1]+" | "+field[0][2]);
        System.out.println("\t\t\t-----------");
        System.out.println("\t\t\t "+field[1][0]+" | "+field[1][1]+" | "+field[1][2]);
        System.out.println("\t\t\t-----------");
        System.out.println("\t\t\t "+field[2][0]+" | "+field[2][1]+" | "+field[2][2]);
    }

}
