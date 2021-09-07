package org.dineshkotwani;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {


    @Test
    public void testMovePlayerToPostionByNumberOnDice(){
        Board board = new Board(100);
        Player player = new Player("Test Player");
        board.movePlayer(player,4);
        assertEquals(4,player.getCurrentPosition());
    }

    @Test
    public void testMovePlayerToPostionByNumberOnDiceExceedingSizeOfBoard(){
        Board board = new Board(100);
        Player player = new Player("Test Player");
        player.setCurrentPosition(95);
        board.movePlayer(player,6);
        assertEquals(95,player.getCurrentPosition());
    }

}
