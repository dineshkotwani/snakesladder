package org.dineshkotwani.services.dice;

import java.util.Random;

public class CrookedDiceService implements DiceService{
    @Override
    public int rollDice() {
        return (new Random().nextInt(3)+1)*2;
    }
}
