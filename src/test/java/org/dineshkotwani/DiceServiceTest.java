package org.dineshkotwani;

import org.dineshkotwani.services.dice.DiceService;
import org.dineshkotwani.services.dice.DiceServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DiceServiceTest {

    @Test
    public void testRollDiceForDiceNumberGreaterThanEqualToOne(){
        DiceService diceService = new DiceServiceImpl();
        int numberOnDice = diceService.rollDice();
        assertTrue(numberOnDice>=1);
    }

    @Test
    public void testRollDiceForDiceNumberLessThanEqualToSix(){
        DiceService diceService = new DiceServiceImpl();
        int numberOnDice = diceService.rollDice();
        assertTrue(numberOnDice<=6);
    }

}
