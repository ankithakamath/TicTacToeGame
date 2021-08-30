package com.yml.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
public int t=0;
	private char[] board = new char[10];
    public int index;
    public char playerChar, computerChar;
    Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	public char turn = ' ';
    
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
	public void desiredLocation() {
		System.out.println("Player is playing");
		System.out.println("Please enter the index 1 to 9");
		Scanner sc= new Scanner(System.in);
		index = sc.nextInt();
		if (index < 1 || index > 9) {
			System.out.println("Please enter the valid index");
			desiredLocation();
		}
	}
	public void CheckFreeSpace()
	{
		
		if(board[index]==' ')					
		{
			board[index]=playerChar;
			DisplayBoard();
		}
		else
			{
				System.out.println("Please enter different index current one is already filled!!!");
				desiredLocation();					
				CheckFreeSpace();
			}}
	public void toss()
	{
		System.out.println("Player do you want to choose head or tail (1 or 0)");
		Scanner sc= new Scanner(System.in);
		int choice=sc.nextInt();							
		
		
		int flipResult=rn.nextInt(2);						
		
		if(choice==flipResult)
		{
			System.out.println("Its player's turn!!!");
			turn='p';
			
			
		}
		else
		{
			System.out.println("Its computer's turn!!!");
			turn='c';
			
		}}
		
	public char isWin() {
		String line = null;

		// to check if there is an winning situation
		for (int a = 1; a < 10; a++) {

			switch (a) {
			case 1:
				line = "" + board[1] + board[2] + board[3];
				break;
			case 2:
				line = "" + board[4] + board[5] + board[6];
				break;
			case 3:
				line = "" + board[7] + board[8] + board[9];
				break;
			case 4:
				line = "" + board[1] + board[4] + board[7];
				break;
			case 5:
				line = "" + board[2] + board[5] + board[8];
				break;
			case 6:
				line = "" + board[3] + board[6] + board[9];
				break;
			case 7:
				line = "" + board[1] + board[5] + board[9];
				break;
			case 8:
				line = "" + board[3] + board[5] + board[7];
				break;
			}
			// For X winner
			if (line.equals("XXX")) {
				return 'X';
			}

			// For O winner
			else if (line.equals("OOO")) {
				return 'O';
			}
		}
		int a1;

		for (a1 = 1; a1 < 10; a1++) {

			if (board[a1] == ' ') {
				break;
			}
		}
		if (a1 == 9)
			return 'd';
		else
			return 'n';
	}

	/** display the winning player or indicate a tie (or unfinished game). */
	public void checkWinner() {

		char win = isWin();
		if (win == playerChar) {
			System.out.println("You have won the game");
			t = 1;
		} else if (win == computerChar) {
			System.out.println("Computere has won the game");
			t = 1;
		} else if (win == 'd') {
			System.out.println("It's a draw! Thanks for playing");
			t = 1;
		} else if (win == 'n') {
			if (turn == 'p') {
				turn = 'c';

			} else {
				turn = 'p';

			}

		}
	}
	public void computerStrategy() {
		turn = 'c';
		System.out.println("Computer is playing!!!");
		if ((board[1] == ' ') && (board[2] == board[3] && board[2] == computerChar)
				|| (board[4] == board[7] && board[4] == computerChar)
				|| (board[5] == board[9] && board[5] == computerChar)) {
			board[1] = computerChar;
		} else if ((board[2] == ' ') && (board[1] == board[3] && board[3] == computerChar)
				|| (board[5] == board[8] && board[8] == computerChar)) {
			board[2] = computerChar;
		} else if ((board[3] == ' ') && (board[1] == board[2] && board[2] == computerChar)
				|| (board[6] == board[9] && board[9] == computerChar)
				|| (board[5] == board[7] && board[7] == computerChar)) {
			board[3] = computerChar;
		} else if ((board[4] == ' ') && (board[1] == board[7] && board[1] == computerChar)
				|| (board[5] == board[6] && board[6] == computerChar)) {
			board[4] = computerChar;
		} else if ((board[5] == ' ') && (board[1] == board[9] && board[2] == computerChar)
				|| (board[7] == board[3] && board[7] == computerChar)
				|| (board[2] == board[8] && board[8] == computerChar)
				|| (board[4] == board[6] && board[6] == computerChar)) {
			board[5] = computerChar;
		} else if ((board[6] == ' ') && (board[9] == board[3] && board[3] == computerChar)
				|| (board[5] == board[4] && board[4] == computerChar)) {
			board[6] = computerChar;
		} else if ((board[7] == ' ') && (board[1] == board[4] && board[4] == computerChar)
				|| (board[3] == board[5] && board[3] == computerChar)
				|| (board[8] == board[9] && board[8] == computerChar)) {
			board[3] = computerChar;
		} else if ((board[8] == ' ') && (board[9] == board[7] && board[7] == computerChar)
				|| (board[2] == board[5] && board[2] == computerChar)) {
			board[8] = computerChar;
		} else if ((board[9] == ' ') && (board[1] == board[5] && board[5] == computerChar)
				|| (board[6] == board[3] && board[3] == computerChar)
				|| (board[8] == board[7] && board[7] == computerChar)) {
			board[9] = computerChar;
		} else if ((board[1] == ' ') && ((board[2] == board[3] && board[2] == playerChar)
				|| (board[4] == board[7] && board[4] == playerChar)
				|| (board[5] == board[9] && board[5] == playerChar))) {
			board[1] = computerChar;

		}

		else if ((board[2] == ' ') && ((board[1] == board[3] && board[3] == playerChar)
				|| (board[5] == board[8] && board[8] == playerChar))) {
			board[2] = computerChar;
		}

		else if ((board[3] == ' ') && ((board[1] == board[2] && board[2] == playerChar)
				|| (board[6] == board[9] && board[9] == playerChar)
				|| (board[5] == board[7] && board[7] == playerChar))) {
			System.out.println("13");
			board[3] = computerChar;
		}

		else if ((board[4] == ' ') && ((board[1] == board[7] && board[7] == playerChar)
				|| (board[5] == board[6] && board[6] == playerChar))) {
			board[4] = computerChar;
		}

		else if ((board[5] == ' ') && ((board[1] == board[9] && board[1] == playerChar)
				|| (board[7] == board[3] && board[7] == playerChar)
				|| (board[2] == board[8] && board[8] == playerChar)
				|| (board[4] == board[6] && board[6] == playerChar))) {
			board[5] = computerChar;
		}

		else if ((board[6] == ' ') && ((board[9] == board[3] && board[3] == playerChar)
				|| (board[5] == board[4] && board[4] == playerChar))) {
			board[6] = computerChar;
		}

		else if ((board[7] == ' ') && ((board[1] == board[4] && board[4] == playerChar)
				|| (board[8] == board[9] && board[9] == playerChar)
				|| (board[5] == board[3] && board[3] == playerChar))) {
			board[7] = computerChar;
		}

		else if ((board[8] == ' ') && ((board[9] == board[7] && board[7] == playerChar)
				|| (board[2] == board[5] && board[2] == playerChar))) {
			board[8] = computerChar;
		}

		else if ((board[9] == ' ') && ((board[1] == board[5] && board[5] == playerChar)
				|| (board[6] == board[3] && board[3] == playerChar)
				|| (board[8] == board[7] && board[7] == playerChar))) {
			board[9] = computerChar;
		}

		 else {
			computerPlay();
		}
		DisplayBoard();
		checkWinner();
		desiredLocation();
	}

	public void computerPlay() {
		while (true) {
			int index = rn.nextInt(9) + 1;
			if (board[index] == ' ') {
				board[index] = computerChar;
				break;
			}
		}
		}
	public static void main(String[] args) {
		System.out.println("Welcome to the game of Tic Tac Toe");
        TicTacToe t=new TicTacToe();
        t.Createboard();
        t.ChooseCharecter();
        t.toss();
        t.desiredLocation();
        t.computerStrategy();
}}
