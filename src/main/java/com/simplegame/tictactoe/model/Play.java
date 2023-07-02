package com.simplegame.tictactoe.model;

import java.util.Scanner;

public class Play {
    public Board board;
    public boolean IsCurrentPlayer1 = true;
    public Player currentPlayer;
    private boolean gameOver = false;

    public Play(Board board){
        this.board = board;
    }

    public void startGame(){
        while(!gameOver) {
            currentPlayer = getCurrentPlayer();
            Move currentmove = getCurrentMove(currentPlayer);
            updateBoard(currentmove);
            board.showBoard();
            /*checkIfWinningOrDraw
                ifAboveThenProvideStatus
                gameOver=true
            changeCurrent*/
        }
    }

    public Player getCurrentPlayer(){
        if(IsCurrentPlayer1)
            return board.player1;
        else
            return board.player2;
    }

    public Move getCurrentMove(Player currentPlayer){
        Scanner scan = new Scanner(System.in);
        System.out.print("Provide "+ currentPlayer.getName()+"'s move = ");
        int poistionIndex = scan.nextInt();
        return new Move(currentPlayer,getPosition(poistionIndex));
    }

    public Position getPosition(int index){
        if(index==1) return Position.P1;
        else if(index==2) return Position.P2;
        else if(index==3) return Position.P3;
        else if(index==4) return Position.P4;
        else if(index==5) return Position.P5;
        else if(index==6) return Position.P6;
        else if(index==7) return Position.P7;
        else if(index==8) return Position.P8;
        else if(index==9) return Position.P9;
        else throw new RuntimeException("Wrong position provided.");
    }

    public void updateBoard(Move move){
        board.field[move.getPosition().row][move.getPosition().col] = move.moveByPlayer.getPlayerMark();
    }


}
