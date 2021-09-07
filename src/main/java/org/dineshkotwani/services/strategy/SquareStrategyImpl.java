package org.dineshkotwani.services.strategy;

public class SquareStrategyImpl implements SquareStrategy{

    private int position;
    public SquareStrategyImpl(int position) {
        this.position = position;
    }

    @Override
    public int computePlayerDestination() {
        return this.position;
    }
}