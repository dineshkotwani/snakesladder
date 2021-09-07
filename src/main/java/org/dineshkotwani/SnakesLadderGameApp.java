package org.dineshkotwani;

import org.dineshkotwani.services.DiceService;
import org.dineshkotwani.services.DiceServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Snake Ladder Main Driver class to take input and bootstrap components
 *
 */
public class SnakesLadderGameApp
{
    public static void main( String[] args )
    {
        List<Player> players = new ArrayList<>();
        Player samplePlayer = new Player("Dinesh");
        players.add(samplePlayer);
        Board sampleBoard = new Board(100);
        DiceService diceService = new DiceServiceImpl();
        Game gameSession = new Game(sampleBoard,samplePlayer,10,diceService);
        gameSession.start();
    }
}
