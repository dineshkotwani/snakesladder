package org.dineshkotwani;

import org.dineshkotwani.services.DiceService;

public class Game {

    private final Board board;
    private final Player player;
    private  int numberOfTurns;
    private  final DiceService diceService;

    public Game(Board board, Player player, int numberOfTurns, DiceService diceService) {
        this.board = board;
        this.player = player;
        this.numberOfTurns = numberOfTurns;
        this.diceService = diceService;
    }

    void start(){
        while(numberOfTurns!=0 || player.isWinner()){
            int numberOnDice = diceService.rollDice();
            board.movePlayer(player,numberOnDice);
            displayInfo();
            numberOfTurns--;
        }
    }

    void displayInfo(){
        System.out.println("Current Positions of player is :: "+player.getCurrentPosition());
    }

}
