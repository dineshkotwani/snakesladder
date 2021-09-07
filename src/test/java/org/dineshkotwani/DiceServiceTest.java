package org.dineshkotwani;

import org.dineshkotwani.services.dice.CrookedDiceService;
import org.dineshkotwani.services.dice.DiceService;
import org.dineshkotwani.services.dice.NormalDiceService;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DiceServiceTest {

    @Test
    public void testRollDiceForDiceNumberGreaterThanEqualToOne(){
        DiceService diceService = new NormalDiceService();
        int numberOnDice = diceService.rollDice();
        assertTrue(numberOnDice>=1);
    }

    @Test
    public void testRollDiceForDiceNumberLessThanEqualToSix(){
        DiceService diceService = new NormalDiceService();
        int numberOnDice = diceService.rollDice();
        assertTrue(numberOnDice<=6);
    }

    @Test
    public void testRollDiceForCrookedDice(){
        DiceService diceService = new CrookedDiceService();
        int numberOnCrookedDice = diceService.rollDice();
        assertTrue(numberOnCrookedDice%2==0);
    }

}
