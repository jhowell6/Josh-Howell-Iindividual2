package edu.jsu.mcis;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TicTacToeBoardTest {
    
    public TicTacToeBoardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testReset() 
	{
        System.out.println("reset");
        TicTacToeBoard instance = new TicTacToeBoard();
        instance.reset();
        
        
    }

    
    @Test
    public void testGetSquare() 
	{
        System.out.println("getSquare");
        String square = "B1";
        TicTacToeBoard instance = new TicTacToeBoard();
        int expResult = 0;
        int result = instance.getSquare(square);
		String expResultS = Integer.toString(expResult);
		String resultS = Integer.toString(result);
        assertEquals(expResultS, resultS);
        
        
    }

    
        @Test
    public void testToString() 
	{
        boolean b = false
		System.out.println("toString");
        TicTacToeBoard instance = new TicTacToeBoard();
        String expResult = "";
        String result = instance.toString();
		if ((result == "") && (expResult == ""))(
			b = true;
		) 
        assertFalse(b);
        
        
    }
    
}
	@Test
    public void testPlayAt() 
	{
        System.out.println("playAt");
        String square = "B2";
        int player = 1;
        TicTacToeBoard instance = new TicTacToeBoard();
        instance.playAt(square, player);
        
        
    }

    @Test
    public void testCanPlayerWin() 
	{
        System.out.println("canPlayerWin");
        int player = 1;
        TicTacToeBoard instance = new TicTacToeBoard();
        String expResult = "";
        String result = instance.canPlayerWin(player);
        assertEquals(expResult, result);
        
        
    }
	
    @Test
    public void testIsGameOver() 
	{
        System.out.println("isGameOver");
        TicTacToeBoard instance = new TicTacToeBoard();
        int expResult = 0;
        int result = instance.isGameOver();
        assertEquals(expResult, result);
        
        
    }

   


    @Test
    public void testGetNextMove() 
	{
        boolean b = false;
		System.out.println("getNextMove");
        TicTacToeBoard instance = new TicTacToeBoard();
        String expResult = "";
        String result = instance.getNextMove();
		if ((result == "") && (expResult == ""))(
			b = true;
		)        
		assertFalse(b);
        
       
    }

  

