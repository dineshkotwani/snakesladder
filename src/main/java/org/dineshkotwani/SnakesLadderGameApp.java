package org.dineshkotwani;

import org.dineshkotwani.services.dice.CrookedDiceService;
import org.dineshkotwani.services.dice.DiceService;
import org.dineshkotwani.services.dice.NormalDiceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        DiceService diceService ;
        sampleBoard.addSnake(14,7);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select dice type , press 1.Normal Dice , 2.Crooked Dice (returns only even numbers)");
        int diceChoice = scanner.nextInt();

        switch (diceChoice) {
            case 1:
                diceService = new NormalDiceService();
                break;
            case 2:
                diceService = new CrookedDiceService();
                break;
            default:
                System.out.println("Incorrect option , selecting normal dice by default");
                diceService = new NormalDiceService();
        }

        Game gameSession = new Game(sampleBoard,samplePlayer,10,diceService);
        gameSession.start();
    }
}
