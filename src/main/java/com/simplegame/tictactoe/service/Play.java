package com.simplegame.tictactoe.service;

import com.simplegame.tictactoe.model.Board;
import com.simplegame.tictactoe.model.Move;
import com.simplegame.tictactoe.model.Player;
import com.simplegame.tictactoe.model.Position;

import java.util.Scanner;

import static com.simplegame.tictactoe.constant.Constant.separator;
import static com.simplegame.tictactoe.model.Position.*;
import static com.simplegame.tictactoe.model.Position.P7;

public class Play {
    public Board board;
    public boolean IsCurrentPlayer1 = true;
    public Player currentPlayer;

    public Play(Board board){
        this.board = board;
    }

    public void startGame(){
        boolean gameOver = false;
        while(!gameOver) {
            currentPlayer = getCurrentPlayer();
            Move currentmove = getCurrentMove(currentPlayer);
            updateBoard(currentmove);
            board.showBoard();
            if(checkIfWonOrDraw(board)){
                System.out.println("!!!!!!!!!!!!! " +currentPlayer.getName()+ " won !!!!!!!!!!!!!");
                System.out.println(separator);
                gameOver = true;
            }
            requestNextPlayer();
        }
    }

    private void requestNextPlayer() {
        IsCurrentPlayer1 = !IsCurrentPlayer1;
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

    public boolean checkIfWonOrDraw(Board board){
        if(Math.abs(board.field[P1.row][P1.col]+board.field[P2.row][P2.col]+board.field[P3.row][P3.col])==3 ||
                Math.abs(board.field[P4.row][P4.col]+board.field[P5.row][P5.col]+board.field[P6.row][P6.col])==3 ||
                Math.abs(board.field[P7.row][P7.col]+board.field[P8.row][P8.col]+board.field[P9.row][P9.col])==3)
            return true;
        else if(Math.abs(board.field[P1.row][P1.col]+board.field[P4.row][P4.col]+board.field[P7.row][P7.col])==3 ||
                Math.abs(board.field[P2.row][P2.col]+board.field[P5.row][P5.col]+board.field[P8.row][P8.col])==3 ||
                Math.abs(board.field[P3.row][P3.col]+board.field[P6.row][P6.col]+board.field[P9.row][P9.col])==3)
            return true;
        else
            return Math.abs(board.field[P1.row][P1.col] + board.field[P5.row][P5.col] + board.field[P9.row][P9.col]) == 3 ||
                    Math.abs(board.field[P3.row][P3.col] + board.field[P5.row][P5.col] + board.field[P7.row][P7.col]) == 3;
    }
}
