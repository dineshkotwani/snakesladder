package org.dineshkotwani;

import org.dineshkotwani.services.strategy.SnakeStrategy;
import org.dineshkotwani.services.strategy.DefaultStrategy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SquareTest {

    @Test
    public void testgetPlayerPositionWithSnakeStrategy(){
        Square testSquare = new Square(14);
        SnakeStrategy snakeStrategy = mock(SnakeStrategy.class);
        when(snakeStrategy.computePlayerDestination()).thenReturn(7);
        testSquare.setStrategy(snakeStrategy);
        assertEquals(7,testSquare.getPlayerPosition()) ;
    }

    @Test
    public void testgetPlayerPositionWithNoSnakesNoLadder(){
        Square testSquare = new Square(14);
        DefaultStrategy defaultStrategy = mock(DefaultStrategy.class);
        when(defaultStrategy.computePlayerDestination()).thenReturn(14);
        testSquare.setStrategy(defaultStrategy);
        assertEquals(14,testSquare.getPlayerPosition()) ;
    }

}
