package com.simplegame.tictactoe;

import com.simplegame.tictactoe.model.Board;

public class TicTacToeApplication {

	public static Board board = new Board();
	public static void main(String[] args) {
		board.init();
		board.showBoard();
	}

}
