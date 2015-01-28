package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;


public class TicTacToeTest 
{
	
	@Test
	public void testBoardIsEmpty() 
	{
		boolean b;
		TicTacToe board = new TicTacToe();
		String s;
		for ( int i = 0; i<3; i++) 
		{
			for (int j=0; j<3; j++)
			{
				s = board.get (i , j);
				assertEquals(s, board.get(i , j));
			}
		}
		
			
		
	}
	
	@Test 
	public void testUserEntry()
	{
		TicTacToe layout = new TicTacToe();	
		assertEquals(layout.getInput(), 1);
		
	}
	

		
		
	
	
	
		
}


	
	