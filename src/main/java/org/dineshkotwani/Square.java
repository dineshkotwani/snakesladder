package org.dineshkotwani;

import lombok.Data;
import org.dineshkotwani.services.strategy.SquareStrategy;
import org.dineshkotwani.services.strategy.SquareStrategyImpl;

@Data
public class Square {

    private int position;
    private SquareStrategy strategy;

    public Square(int position) {
        this.position = position;
        this.strategy = new SquareStrategyImpl(position);
    }

    public int getPlayerPosition(){
        return strategy.computePlayerDestination();
    }

}
