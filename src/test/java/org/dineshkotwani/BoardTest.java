package org.dineshkotwani;

import org.dineshkotwani.services.strategy.SnakeStrategy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {

    Board board = new Board(100);
    @Test
    public void testMovePlayerToPostionByNumberOnDice(){
        Player player = new Player("Test Player");
        board.movePlayer(player,4);
        assertEquals(4,player.getCurrentPosition());
    }

    @Test
    public void testMovePlayerToPostionByNumberOnDiceExceedingSizeOfBoard(){
        Player player = new Player("Test Player");
        player.setCurrentPosition(95);
        board.movePlayer(player,6);
        assertEquals(95,player.getCurrentPosition());
    }

    @Test
    public void testMovePlayerToPostionByNewPositionEqualToSizeOfBoard(){
        Player player = new Player("Test Player");
        player.setCurrentPosition(95);
        board.movePlayer(player,5);
        assertEquals(100,player.getCurrentPosition());
        assertEquals(true,player.isWinner());
    }

    @Test
    public void testMovePlayerMovingPlayerToSnakeTail(){
        board.addSnake(30,12);
        Player player = new Player("Test player");
        player.setCurrentPosition(28);
        board.movePlayer(player,2);
        assertEquals(12,player.getCurrentPosition());
    }



    @Test
    public void testaddSnakeWithHeadGreaterThanTail(){
        board.addSnake(14,7);
        Square square = board.getSquares().get(13);
        boolean isSnake = square.getStrategy() instanceof SnakeStrategy;
        assertEquals(true,isSnake);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaddSnakeWithHeadLessThanTail(){
        board.addSnake(7,14);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testaddSnakeWithHeadLessThanZero(){
        board.addSnake(0,-8);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testaddSnakeWithHeadMoreThanSize(){
        board.addSnake(200,23);
    }



}
