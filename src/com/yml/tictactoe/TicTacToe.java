package com.yml.tictactoe;

import java.util.*;

public class TicTacToe {

	private char[] board = new char[10];

	public void DisplayBoard()
	{
		
		for(int i = 1 ; i<10 ; i+=3)
		{

			
			System.out.println(" " + board[i] + " | " + board[i+1] + " | " + board[i+2] + " ");
			System.out.println("-----------");
		}
}

	public void ChooseCharecter() {
		System.out.println("Enter the input(X or O) ");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		char computerChar;
		char playerChar;
		if(c == 'x')
			{
			computerChar='o';
			playerChar='x';
			}
		else
			{
			computerChar='x';
			playerChar='o';
			}
		}
	
	public void Createboard() {

		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';

		}
	} 
	
	public static void main(String[] args) {
		System.out.println("Welcome to the game of Tic Tac Toe");
        TicTacToe t=new TicTacToe();
        t.Createboard();
        t.ChooseCharecter();
        t.DisplayBoard();
	}

}
