package org.dineshkotwani.services;

import org.dineshkotwani.services.DiceService;

import java.util.Random;

public class DiceServiceImpl implements DiceService {


    @Override
    public int rollDice() {
        return new Random().nextInt(6)+1;
    }
}
