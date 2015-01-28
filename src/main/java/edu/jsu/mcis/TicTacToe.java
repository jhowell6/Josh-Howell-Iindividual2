package edu.jsu.mcis;

import java.util.*;
import java.lang.*;

public class TicTacToe{
	
	
	private char currentPlayerMark;
	public String[][] board = new String [3][3];
	int x = 0;
	int y = 0;
	void TicTacToe()
	{
		for (int i = 0; i<3; i++) 
		{
			for (int j=0; j<3; j++)
			{
				board [i][j]= "-";
			}
		}
		
	}
	public String get(int r, int c)
	{
		String tt = board[r][c];
		return tt;
	}
	
	public int getInput(){
			int g = 0;		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the row.");
			if (!scan.hasNext())
			{
				g=1;
			}
			if (scan.hasNext())
			{
				g = scan.nextInt();
			}
			return g;
	}
	public void changePlayerMark()
	{
		if (currentPlayerMark == 'X')
		{
			currentPlayerMark = 'O';
		}
		else 
		{
			currentPlayerMark = 'X';
		}
	}
}