package org.dineshkotwani.services.strategy;

public class DefaultStrategy implements SquareStrategy{

    private int position;
    public DefaultStrategy(int position) {
        this.position = position;
    }

    @Override
    public int computePlayerDestination() {
        return this.position;
    }
}
