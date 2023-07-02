package com.simplegame.tictactoe;

import com.simplegame.tictactoe.model.Board;
import com.simplegame.tictactoe.model.Play;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicTacToeApplication {

	public static Board board = new Board();

	public static void main(String[] args) {
		System.out.println("******************* TIC-TAC-TOE *******************");
		board.init();
		Play play = new Play(board);
		play.startGame();
	}
}