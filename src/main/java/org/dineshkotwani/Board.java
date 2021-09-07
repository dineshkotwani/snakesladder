package org.dineshkotwani;

import lombok.Data;
import org.dineshkotwani.services.strategy.SnakeStrategy;

import java.util.ArrayList;
import java.util.List;


@Data
public class Board {
    private final int size;
    private List<Square> squares ;

    public Board(int size) {
        this.squares = new ArrayList<>();
        this.size = size;
        for(int i=1;i<=size;i++)
        {
            Square cell = new Square(i);
            this.squares.add(cell);
        }
    }

    public void movePlayer(Player player,int numberOnDice){
        int position = player.getCurrentPosition() + numberOnDice;
        if(position<=size){
            int destCellPosition  = this.squares.get(position-1).getPlayerPosition();
            player.setCurrentPosition(destCellPosition);
            System.out.println("Player position set to "+ destCellPosition);
            if(destCellPosition==this.size)
                player.setWinner(true);
        }

    }

    void addSnake(int headPosition,int tailPosition) {
        if(isSnakeValid(headPosition,tailPosition)){
            Square head =   this.squares.get(headPosition-1);
            head.setStrategy(new SnakeStrategy(tailPosition));
        }
        else
            throw new IllegalArgumentException("Head position has to be more than tail position");
    }

    private boolean isSnakeValid(int headPos,int tailPos){
        if(headPos<=0 || tailPos<=0 )
            return false;
        if(headPos>size || tailPos>size)
            return false;
        if(headPos<=tailPos)
            return false;
        return true;
    }

}
