package org.dineshkotwani;

import org.dineshkotwani.services.strategy.SnakeStrategy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SnakeStrategyTest {


    @Test
    public void testcomputePlayerDestinationOnSnakeSquare(){
        SnakeStrategy snakeStrategy = new SnakeStrategy(7);
        assertEquals(7,snakeStrategy.computePlayerDestination()) ;
    }
}
