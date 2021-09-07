package org.dineshkotwani.services.strategy;

public class SnakeStrategy implements SquareStrategy{

    private int tailPosition;

    public SnakeStrategy(int tailPosition) {
        this.tailPosition = tailPosition;
    }

    @Override
    public int computePlayerDestination() {
        System.out.println("Snake bit  position ");
        return tailPosition;
    }
}
