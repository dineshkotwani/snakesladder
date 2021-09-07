package org.dineshkotwani;

import lombok.Data;

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
        if(position<size){
            int destCellPosition  = this.squares.get(position-1).getPlayerPosition();
            player.setCurrentPosition(destCellPosition);
            System.out.println("Player position set to "+ destCellPosition);
            if(destCellPosition==this.size)
                player.setWinner(true);
        }

    }



}
