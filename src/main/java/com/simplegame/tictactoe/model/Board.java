package com.simplegame.tictactoe.model;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.simplegame.tictactoe.constant.Constant.separator;
import static com.simplegame.tictactoe.model.PlayerMark.unassigned;

public class Board {
    List<Move> moveList;
    int field[][] = new int[3][3];

    public Player player1;
    public Player player2;
    public Board(){};

    public void init(){
        for(int i=0; i<3; i++)
            Arrays.fill(field[i],unassigned.mark);
        configurePlayers();
        System.out.println("\nBoard initiated - ");
        showBoard();
    }

    public void configurePlayers(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nPlease provide Player1 name [1]: ");
        String name = scan.nextLine();
        player1 = new Player(name, 1);
        System.out.print("Please provide Player2 name [-1]: ");
        name = scan.nextLine();
        player2 = new Player(name, -1);
    }

    public void showBoard(){
        System.out.println("\n\t\t\t "+field[0][0]+" | "+field[0][1]+" | "+field[0][2]);
        System.out.println("\t\t\t---|---|---");
        System.out.println("\t\t\t "+field[1][0]+" | "+field[1][1]+" | "+field[1][2]);
        System.out.println("\t\t\t---|---|---");
        System.out.println("\t\t\t "+field[2][0]+" | "+field[2][1]+" | "+field[2][2]);
        System.out.println("\n"+separator);
    }

}
