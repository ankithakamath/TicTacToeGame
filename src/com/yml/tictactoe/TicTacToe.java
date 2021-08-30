package com.yml.tictactoe;

public class TicTacToe {

	private char[] board = new char[10];

	public void Createboard() {

		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';

		}
	} 
	
	public static void main(String[] args) {
		System.out.println("Welcome to the game of Tic Tac Toe");
        TicTacToe t=new TicTacToe();
        t.Createboard();
	}

}
